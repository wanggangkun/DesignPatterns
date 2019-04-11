package com.kun.adapter;

import com.kun.adapter.adapter.TurkeyAdapter2;
import com.kun.adapter.duck.Duck;
import com.kun.adapter.duck.GreenHeadDuck;
import com.kun.adapter.turkey.WildTurkey;

/**
 * @author kun
 * @data 2019/3/15 19:28
 */
public class MainTest {
    public static void main(String[] args) {
        GreenHeadDuck duck = new GreenHeadDuck();
        WildTurkey turkey = new WildTurkey();
        Duck duck2turkeyAdapter = new TurkeyAdapter2();
        turkey.gobble();
        turkey.fly();
        duck.quack();
        duck.fly();
        duck2turkeyAdapter.quack();
        duck2turkeyAdapter.fly();
    }
}
