package com.kun.strategy.stimulateduck.duck;

import com.kun.strategy.stimulateduck.flybehavior.GoodFlyBehavior;
import com.kun.strategy.stimulateduck.quackbehavior.GaGaQuackBehavior;

/**
 * @author kun
 * @data 2019/3/7 19:22
 * 实现一种具体的GreenHeadDuck，继承Duck，构造方法中实例化具体的GoodFly与GaGeQuack行为
 */
public class GreenHeadAbstractDuck extends AbstractDuck {

    public GreenHeadAbstractDuck(){
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GaGaQuackBehavior();
    }
    @Override
    public void display() {
        System.out.println("**GreenHead**");
    }
}
