package com.kun.strategy.stimulateduck.flybehavior;

/**
 * @author kun
 * @data 2019/3/7 19:13
 * 飞行行为中的NoFly
 */
public class NoFlyBehavior implements FlyBehavior {
    public void fly() {
        System.out.println("--NoFly--");
    }
}
