package com.kun.factory.pizzastore.pizza;

/**
 * @author kun
 * @data 2019/3/11 21:49
 */
public class GreekPizza extends AbstractPizza {
    @Override
    public void prepare() {
        super.setName("GreekPizza");
        System.out.println(name + " preparing;");
    }
}
