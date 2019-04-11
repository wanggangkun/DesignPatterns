package com.kun.decorator.coffeebar.decorator;

import com.kun.decorator.coffeebar.AbstractDrink;

/**
 * @author kun
 * @data 2019/3/7 21:11
 */
public class Chocolate extends Decorator {

    public Chocolate(AbstractDrink abstractDrink) {
        super(abstractDrink);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
