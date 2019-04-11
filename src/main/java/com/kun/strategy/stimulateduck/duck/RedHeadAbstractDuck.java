package com.kun.strategy.stimulateduck.duck;

import com.kun.strategy.stimulateduck.flybehavior.BadFlyBehavior;
import com.kun.strategy.stimulateduck.quackbehavior.GeGeQuackBehavior;

/**
 * @author kun
 * @data 2019/3/7 19:22
 * 实现一种具体的RedHeadDuck，继承Duck，构造方法中实例化具体的BadFly与GeGeQuack行为
 */
public class RedHeadAbstractDuck extends AbstractDuck {

    public RedHeadAbstractDuck(){
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new GeGeQuackBehavior();
    }
    @Override
    public void display() {
        System.out.println("**RedHead**");
    }
}
