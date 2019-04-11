package com.kun.strategy.stimulateduck.quackbehavior;

/**
 * @author kun
 * @data 2019/3/7 19:14
 * 鸭子叫行为中的NoQuack
 */
public class NoQuackBehavior implements QuackBehavior {
    public void quack() {
        System.out.println("__NoQuack__");
    }
}
