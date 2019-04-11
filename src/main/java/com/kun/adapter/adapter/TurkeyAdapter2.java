package com.kun.adapter.adapter;

import com.kun.adapter.duck.Duck;
import com.kun.adapter.turkey.WildTurkey;

/**
 * @author kun
 * @data 2019/3/15 19:42
 */
public class TurkeyAdapter2 extends WildTurkey implements Duck {
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }
}
