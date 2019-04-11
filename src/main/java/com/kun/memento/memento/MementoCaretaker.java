package com.kun.memento.memento;

import java.util.HashMap;

/**
 * @author kun
 * @data 2019/4/7 17:03
 */
public class MementoCaretaker {
    private HashMap<String, MementoIF> mementoMap;
    public MementoCaretaker(){
        mementoMap = new HashMap<String, MementoIF>();
    }
    public MementoIF retrieveMemento(String name){
        return mementoMap.get(name);
    }
    public void saveMemento(String name, MementoIF memento){
        this.mementoMap.put(name, memento);
    }
}
