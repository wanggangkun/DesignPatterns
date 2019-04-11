package com.kun.factory.pizzastore;

import com.kun.factory.pizzastore.absfactory.NYFactory;

/**
 * @author kun
 * @data 2019/3/11 21:57
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza;
        orderPizza = new OrderPizza(new NYFactory());
    }
}
