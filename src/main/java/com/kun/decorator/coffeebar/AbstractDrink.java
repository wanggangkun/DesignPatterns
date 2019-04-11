package com.kun.decorator.coffeebar;

/**
 * @author kun
 * @data 2019/3/7 21:00
 */
public abstract class AbstractDrink {

    protected String description = "";
    private float price = 0f;

    public String getDescription() {
        return description + "-" + this.getPrice();
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    protected float getPrice() {
        return price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
