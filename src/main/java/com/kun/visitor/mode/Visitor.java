package com.kun.visitor.mode;

/**
 * @author kun
 * @data 2019/4/9 17:29
 */
public interface Visitor {
    /**
     * 访问
     * @param element 元素
     */
    abstract public void visit(Element element);
}
