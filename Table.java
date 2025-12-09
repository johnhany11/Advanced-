/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.furnitureitem;

/**
 *
 * @author giova
 */
public class Table extends FurnitureItem {

    private String shape;
    private String dimensions;

    public Table(int itemid, String name, double price, String material,
                 int stock, String shape, String dimensions) {

        super(itemid, name, price, material, stock);
        this.shape = shape;
        this.dimensions = dimensions;
    }

    public String getShape() {
        return shape;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        return super.toString() + ", Shape: " + shape + ", Dimensions: " + dimensions;
    }
}
