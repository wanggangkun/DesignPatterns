package com.kun.factory.pizzastore;

import com.kun.factory.pizzastore.absfactory.AbsFactory;
import com.kun.factory.pizzastore.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author kun
 * @data 2019/3/11 21:46
 */
public class OrderPizza {
    private AbsFactory absFactory;
    OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }
    public void setFactory(AbsFactory absFactory){
        AbstractPizza abstractPizza = null;
        String orderType;
        this.absFactory = absFactory;
        do {
            orderType = getType();
            abstractPizza = absFactory.createPizza(orderType);
            abstractPizza.prepare();
            abstractPizza.bake();
            abstractPizza.cut();
            abstractPizza.box();
        }while (true);
    }

    private String getType(){
        String type = null;
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            type = strin.readLine();

        }catch (Exception e){
            e.printStackTrace();
        }
        return type;
    }
}
