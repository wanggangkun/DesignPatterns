package com.kun.template;

import com.kun.template.drink.Coffee;
import com.kun.template.drink.HotDrink;
import com.kun.template.drink.TeaWithHook;


/**
 * @author kun
 * @data 2019/3/18 17:16
 */
public class MainTest {
    public static void main(String[] args) {
        HotDrink coffee = new Coffee();
        TeaWithHook tea = new TeaWithHook();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
