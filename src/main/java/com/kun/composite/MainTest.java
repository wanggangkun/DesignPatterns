package com.kun.composite;

import com.kun.composite.composemode.CakeHouseMenu;
import com.kun.composite.composemode.DinerMenu;
import com.kun.composite.composemode.Waitress;

/**
 * @author kun
 * @data 2019/3/19 20:29
 */
public class MainTest {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        CakeHouseMenu cakeHouseMenu = new CakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        waitress.addComponent(cakeHouseMenu);
        waitress.addComponent(dinerMenu);
        waitress.printVegetableMenu();
    }
}
