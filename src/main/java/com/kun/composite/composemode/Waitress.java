package com.kun.composite.composemode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/19 20:00
 */
public class Waitress {
    private ArrayList<BaseMenuComponent> iterators = new ArrayList<BaseMenuComponent>();
    public Waitress(){

    }
    public void addComponent(BaseMenuComponent baseMenuComponent){
        iterators.add(baseMenuComponent);
    }
    public void printMenu(){
        Iterator iterator;
        BaseMenuComponent menuItem;
        for (BaseMenuComponent baseMenuComponent : iterators) {
            baseMenuComponent.print();
            iterator = baseMenuComponent.getIterator();
            while (iterator.hasNext()) {
                menuItem = (BaseMenuComponent) iterator.next();
                menuItem.print();
            }
        }
    }
    public void printBreakfastMenu(){

    }
    public void printLunchMenu(){

    }
    public void printVegetableMenu(){
        Iterator iterator;
        BaseMenuComponent menuItem;
        for (BaseMenuComponent baseMenuComponent : iterators) {
            baseMenuComponent.print();
            iterator = baseMenuComponent.getIterator();
            while (iterator.hasNext()) {
                menuItem = (BaseMenuComponent) iterator.next();
                if (menuItem.isVegetable()){
                    menuItem.print();
                }
            }
        }
    }
}
