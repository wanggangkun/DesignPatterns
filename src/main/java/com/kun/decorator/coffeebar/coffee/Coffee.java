package com.kun.decorator.coffeebar.coffee;

import com.kun.decorator.coffeebar.AbstractDrink;

/**
 * @author kun
 * @data 2019/3/7 21:04
 */
public class Coffee extends AbstractDrink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
