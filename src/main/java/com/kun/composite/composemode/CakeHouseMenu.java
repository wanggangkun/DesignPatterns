package com.kun.composite.composemode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/19 20:08
 */
public class CakeHouseMenu extends BaseMenuComponent {
    private ArrayList<BaseMenuComponent> menuItems;
    public CakeHouseMenu(){
        menuItems = new ArrayList<BaseMenuComponent>();
        addItem("KFC Cake Breakfast", "boiled eggs&toast&cabbage", true, 3.99f);
        addItem("MDL Cake Breakfast", "fired eggs&toast", false, 3.59f);
        addItem("Strawberry Cake", "fresh strawberry", true, 3.29f);
        addItem("Regular Cake Breakfast", "toast&sausage", true, 2.59f);
    }
    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }

    @Override
    public void print() {
        System.out.println("***This is CakeHouseMenu***");
    }

    @Override
    public Iterator getIterator(){
        return new ComposeIterator(menuItems.iterator());
    }
}
