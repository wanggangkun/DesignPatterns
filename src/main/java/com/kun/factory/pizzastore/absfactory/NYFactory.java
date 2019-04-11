package com.kun.factory.pizzastore.absfactory;

import com.kun.factory.pizzastore.pizza.AbstractPizza;
import com.kun.factory.pizzastore.pizza.NyCheesePizza;
import com.kun.factory.pizzastore.pizza.NyPeeperPizza;

/**
 * @author kun
 * @data 2019/3/11 22:18
 */
public class NYFactory implements AbsFactory {

    public AbstractPizza createPizza(String orderType) {
        AbstractPizza abstractPizza = null;
        if ("cheese".equals(orderType)){
            abstractPizza = new NyCheesePizza();
        }else if ("pepper".equals(orderType)){
            abstractPizza = new NyPeeperPizza();
        }
        return abstractPizza;
    }
}
