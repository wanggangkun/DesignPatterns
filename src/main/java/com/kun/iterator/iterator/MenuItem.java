package com.kun.iterator.iterator;

/**
 * @author kun
 * @data 2019/3/19 20:09
 */
public class MenuItem {
    private String name, description;
    private boolean vegetable;
    private float price;

    MenuItem(String name, String description, boolean vegetable, float price) {
        this.name = name;
        this.description = description;
        this.vegetable = vegetable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    public boolean isVegetable() {
        return vegetable;
    }

    float getPrice() {
        return price;
    }
}
