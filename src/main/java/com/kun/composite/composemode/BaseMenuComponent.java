package com.kun.composite.composemode;

import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/20 16:52
 */
public abstract class BaseMenuComponent {
    public String getName() {
        return "";
    }

    public String getDescription() {
        return "";
    }

    public boolean isVegetable() {
        return false;
    }

    public float getPrice() {
        return 0;
    }

    /**
     * 打印信息
     */
    public abstract void print();
    public Iterator getIterator(){
        return new NullIterator();
    }
}
