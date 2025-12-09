package com.mycompany.jproject;
import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private int warehouseId;
    private String location;
    private List<FurnitureItem> inventory;

    public Warehouse(int warehouseId, String location) {
        this.warehouseId = warehouseId;
        this.location = location;
        this.inventory = new ArrayList<>();
    }

    public void addItem(FurnitureItem item) {
        inventory.add(item);
    }

    public void removeItem(int id) {
        inventory.removeIf(i -> i.getItemId() == id);
    }

    public boolean checkAvailability(int id) {
        for (FurnitureItem item : inventory) {
            if (item.getItemId() == id && item.getStock() > 0) {
                return true;
            }
        }
        return false;
    }

}
