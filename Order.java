/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerceproject;

/**
 *
 * @author Eng. Youssef
 */
import java.util.List;

public class Order {
    private User user;
    private List<FurnitureItem> items;
    private boolean paid = false;

    public Order(User user, List<FurnitureItem> items) {
        this.user = user;
        this.items = items;
    }

    public User getUser() { return user; }

    public double getTotalAmount() {
        double sum = 0;
        for (FurnitureItem i : items) sum += i.getPrice();
        return sum;
    }

    public void setPaid(boolean paid) { this.paid = paid; }
    public boolean isPaid() { return paid; }
}
