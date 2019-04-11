package com.kun.decorator.coffeebar;

import com.kun.decorator.coffeebar.coffee.Decaf;
import com.kun.decorator.coffeebar.coffee.LongBlack;
import com.kun.decorator.coffeebar.decorator.Chocolate;
import com.kun.decorator.coffeebar.decorator.Milk;

/**
 * @author kun
 * @data 2019/3/7 21:13
 */
public class CoffeeBar {
    public static void main(String[] args) {
        AbstractDrink order;
        order = new Decaf();
        //order1 price:3.0
        //order1 desc:Decaf-3.0
        //*************************
        //order2 price:12.0
        //order2 desc:Chocolate-3.0 && Chocolate-3.0 && Milk-2.0 && LongBlack-4.0
        System.out.println("order1 price:" + order.cost());
        System.out.println("order1 desc:" + order.getDescription());
        System.out.println("*************************");
        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order2 price:" + order.cost());
        System.out.println("order2 desc:" + order.getDescription());
    }
}
