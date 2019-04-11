package com.kun.template.drink;

/**
 * @author kun
 * @data 2019/3/18 17:18
 */
public abstract class HotDrink {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    private void boilWater(){
        System.out.println("Boiling water");
    }

    /**
     * 冲泡
     */
    public abstract void brew();
    private void pourInCup(){
        System.out.println("Pouring into cup");
    }

    /**
     * 加酌料
     */
    public abstract void addCondiments();
}
