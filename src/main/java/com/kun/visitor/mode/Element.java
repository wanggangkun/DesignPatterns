package com.kun.visitor.mode;

/**
 * @author kun
 * @data 2019/4/9 17:27
 */
public abstract class Element {
    /**
     * 接受新功能
     * @param visitor 访问者
     */
    abstract public void accept(Visitor visitor);
}
