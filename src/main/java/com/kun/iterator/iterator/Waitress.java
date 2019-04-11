package com.kun.iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/19 20:00
 */
public class Waitress {
    private ArrayList<Iterator> iterators = new ArrayList<Iterator>();
    public Waitress(){

    }
    public void addIterator(Iterator iterator){
        iterators.add(iterator);
    }
    public void printMenu(){
        Iterator iterator;
        MenuItem menuItem;
        for (Iterator iterator1 : iterators) {
            iterator = iterator1;
            while (iterator.hasNext()) {
                menuItem = (MenuItem) iterator.next();
                System.out.println(menuItem.getName() + "***" +
                        menuItem.getPrice() + "***" + menuItem.getDescription());
            }
        }
    }
}
