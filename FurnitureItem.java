/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.furnitureitem;

/**
 *
 * @author giova
 */
public abstract class FurnitureItem implements Comparable <FurnitureItem> {
    protected int itemid;
    protected String name;
    protected double price;
    protected String material;
    protected int stock;

        public FurnitureItem(int itemid, String name, double price, String material, int stock) {
        this.itemid = itemid;
        this.name = name;
        this.price = price;
        this.material = material;
        this.stock = stock;
        }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override    
     public int compareTo(FurnitureItem other) {                   
        return Double.compare(this.price, other.price);
    }
     
    @Override

    public String toString() {
        return "FurnitureItem{" + "itemid=" + itemid + ", name=" + name + ", price=" + price + ", material=" + material + ", stock=" + stock + '}';
    }
    

}
    
    
