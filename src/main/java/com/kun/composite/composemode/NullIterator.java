package com.kun.composite.composemode;

import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/20 17:20
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {

    }
}
