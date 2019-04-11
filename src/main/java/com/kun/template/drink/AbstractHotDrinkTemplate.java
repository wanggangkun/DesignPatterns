package com.kun.template.drink;

/**
 * @author kun
 * @data 2019/3/18 17:30
 */
public abstract class AbstractHotDrinkTemplate {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (wantCondimentsHook()){
            addCondiments();
        }else {
            System.out.println("No Condiments");
        }
    }
    public boolean wantCondimentsHook(){
        return true;
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
     * 加佐料
     */
    public abstract void addCondiments();
}
