package com.kun.factory.pizzastore.absfactory;

import com.kun.factory.pizzastore.pizza.AbstractPizza;
import com.kun.factory.pizzastore.pizza.LdCheesePizza;
import com.kun.factory.pizzastore.pizza.LdPeeperPizza;

/**
 * @author kun
 * @data 2019/3/11 22:18
 */
public class LdFactory implements AbsFactory {
    public AbstractPizza createPizza(String orderType) {
        AbstractPizza abstractPizza = null;
        if ("cheese".equals(orderType)){
            abstractPizza = new LdCheesePizza();
        }else if ("pepper".equals(orderType)){
            abstractPizza = new LdPeeperPizza();
        }
        return abstractPizza;
    }
}
