package com.kun.composite.composemode;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author kun
 * @data 2019/3/20 17:21
 */
public class ComposeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<Iterator>();
    ComposeIterator(Iterator iterator){
        stack.push(iterator);
    }
    public boolean hasNext() {
        if (stack.empty()){
            return false;
        }
        Iterator iterator = stack.peek();
        if (!iterator.hasNext()){
            stack.pop();
            return hasNext();
        }else {
            return true;
        }
    }

    public Object next() {
        if (hasNext()){
            Iterator iterator = stack.peek();
            BaseMenuComponent baseMenuComponent = (BaseMenuComponent)iterator.next();
            stack.push(baseMenuComponent.getIterator());
            return baseMenuComponent;
        }
        return null;
    }

    public void remove() {

    }
}
