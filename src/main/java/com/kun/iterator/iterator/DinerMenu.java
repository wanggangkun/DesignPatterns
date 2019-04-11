package com.kun.iterator.iterator;

import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/19 20:17
 */
public class DinerMenu {
    private final static int MAX_ITEMS = 5;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
        addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
        addItem("bean soup", "bean&potato salad", true, 3.28f);
        addItem("hot dog", "onions&cheese&bread", false, 3.05f);
    }

    private void addItem(String name, String description, boolean vegetable, float price) {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full! Can not add another item");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    public Iterator getIterator(){
        return new DinerIterator();
    }
    class DinerIterator implements Iterator{
        private int position = 0;
        DinerIterator(){
            position = 0;
        }
        public boolean hasNext() {
            return position < numberOfItems;
        }

        public Object next() {
            MenuItem menuItem = menuItems[position];
            position++;
            return menuItem;
        }

        public void remove() {

        }
    }

}
