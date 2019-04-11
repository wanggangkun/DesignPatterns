package com.kun.adapter.adapter;

import com.kun.adapter.duck.Duck;
import com.kun.adapter.turkey.Turkey;

/**
 * @author kun
 * @data 2019/3/15 19:25
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i=0; i<6; i++){
            turkey.fly();
        }
    }
}
