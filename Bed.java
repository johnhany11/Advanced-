/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.furnitureitem;

/**
 *
 * @author giova
 */
public class Bed extends FurnitureItem{
    private String size;

    public Bed(int itemid, String name, double price, String material, int stock, String size) {

        super(itemid, name, price, material, stock);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size;
    }
}

