/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommerceproject;

import java.util.ArrayList;
import java.util.List;

public class ECommerceSystem {

    // ======================= ATTRIBUTES =======================
    private List<User> users;
    private List<Warehouse> warehouses;
    private List<Order> orders;
    private List<FurnitureItem> allItems;

    // ======================= CONSTRUCTOR =======================
    public ECommerceSystem() {
        this.users = new ArrayList<>();
        this.warehouses = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.allItems = new ArrayList<>();
    }

    // ======================= METHODS =======================

    // Register a new user
    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }

    // Search items using keyword
    public List<FurnitureItem> searchItems(String keyword) {
        List<FurnitureItem> result = new ArrayList<>();
        for (FurnitureItem item : allItems) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }

    // Sort all items by price (ascending)
    public void sortItems() {
        allItems.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
        System.out.println("Items sorted by price.");
    }

    // Place an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order placed for user: " + order.getUser().getName());
    }

    // Process a payment
    public boolean processPayment(Order order, PaymentMethod p) {
        boolean paid = p.pay(order.getTotalAmount());
        if (paid) {
            order.setPaid(true);
            System.out.println("Payment successful for order");
        } else {
            System.out.println("Payment failed.");
        }
        return paid;
    }

    // ======================= EXAMPLE ADD METHODS =======================
    public void addItem(FurnitureItem item) {
        allItems.add(item);
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }
}

