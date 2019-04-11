package com.kun.iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/19 20:08
 */
public class CakeHouseMenu {
    private ArrayList<MenuItem> menuItems;
    public CakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem("KFC Cake Breakfast", "boiled eggs&toast&cabbage", true, 3.99f);
        addItem("MDL Cake Breakfast", "fired eggs&toast", false, 3.59f);
        addItem("Strawberry Cake", "fresh strawberry", true, 3.29f);
        addItem("Regular Cake Breakfast", "toast&sausage", true, 2.59f);
    }
    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }

    public Iterator getIterator(){
        return menuItems.iterator();
    }
}
