/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.furnitureitem;

/**
 *
 * @author giova
 */
public class Sofa extends FurnitureItem {

    private int seats;
    private String color;

    public Sofa(int itemid, String name, double price, String material,
                int stock, int seats, String color) {

        super(itemid, name, price, material, stock);
        this.seats = seats;
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seats: " + seats + ", Color: " + color;
    }
}
