package com.kun.composite.composemode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/19 20:08
 */
public class SubMenu extends BaseMenuComponent {
    private ArrayList<BaseMenuComponent> menuItems;
    SubMenu(){
        menuItems = new ArrayList<BaseMenuComponent>();
        addItem("Apple Cookie", "Apple&candy&Cookie", true, 1.99f);
        addItem("Banana Cookie", "Banana&candy&Cookie", false, 1.59f);
        addItem("Orange Cookie", "Orange&Cookie", true, 1.29f);
    }
    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }

    @Override
    public void print() {
        System.out.println("***This is SubMenu***");
    }

    @Override
    public Iterator getIterator(){
        return new ComposeIterator(menuItems.iterator());
    }
}
