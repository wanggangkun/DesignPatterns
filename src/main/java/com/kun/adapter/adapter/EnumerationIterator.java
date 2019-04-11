package com.kun.adapter.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author kun
 * @data 2019/3/15 19:48
 */
public class EnumerationIterator implements Iterator<Object> {
    private Enumeration enumeration;
    public EnumerationIterator(Enumeration enumeration){
        this.enumeration = enumeration;
    }
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
