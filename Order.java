
package com.mycompany.jproject;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final int orderId;
    private Customer customer;
    private List<FurnitureItem> items;
    private double totalPrice;
    private String status;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalPrice = 0;
        this.status = "Pending"; 
    }

    public void addItem(FurnitureItem item) {
        items.add(item);
        calculateTotal();
        updateStatus(); 
    }

    public void removeItem(int id) {
        items.removeIf(i -> i.getItemId() == id);
        calculateTotal();
        updateStatus(); // update status automatically
    }

    public double calculateTotal() {
        totalPrice = 0;
        for (FurnitureItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    // Automatically updates the status based on current state
    private void updateStatus() {
        if (totalPrice >= 0) {
            status = "Pending";
        } else{
            status = "Processing";
        }
    }

    public void printOrder() {
        System.out.println("Order #" + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items:");

        for (FurnitureItem item : items) {
            System.out.println("- " + item.getName() + " : " + item.getPrice());
        }

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Status: " + status);
    }
}
