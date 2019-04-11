package com.kun.flyweight.fly;

/**
 * @author kun
 * @data 2019/4/3 17:17
 */
public abstract class AbstractPlant {
    AbstractPlant(){

    }

    /**
     * 展示
     * @param x x坐标
     * @param y y坐标
     * @param age 年龄
     */
    public abstract void display(int x, int y, int age);
}
