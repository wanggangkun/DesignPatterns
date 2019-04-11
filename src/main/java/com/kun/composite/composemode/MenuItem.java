package com.kun.composite.composemode;

/**
 * @author kun
 * @data 2019/3/19 20:09
 */
public class MenuItem extends BaseMenuComponent {
    private String name, description;
    private boolean vegetable;
    private float price;

    MenuItem(String name, String description, boolean vegetable, float price) {
        this.name = name;
        this.description = description;
        this.vegetable = vegetable;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetable() {
        return vegetable;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(getName() + "***" + getPrice() + "***" + getDescription());
    }
}
