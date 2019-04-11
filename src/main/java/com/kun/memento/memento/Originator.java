package com.kun.memento.memento;

import java.util.HashMap;

/**
 * @author kun
 * @data 2019/4/7 17:19
 */
public class Originator {
    private HashMap<String, String> state;
    public Originator(){
        state = new HashMap<String, String>();
    }
    public MementoIF createMemento(){
        return new Memento(state);
    }
    public void restoreMemento(MementoIF memento){
        state = ((Memento) memento).getState();
    }
    public void showState(){
        System.out.println("now state:" + state.toString());
    }
    public void testState1(){
        state.put("blood", "500");
        state.put("progress", "gate1 end");
        state.put("enemy", "5");
    }
    public void testState2(){
        state.put("blood", "450");
        state.put("progress", "gate3 start");
        state.put("enemy", "3");
    }
    private class Memento implements MementoIF{
        private HashMap<String, String> state;
        private Memento(HashMap state){
            this.state = new HashMap<String, String>(state);
        }
        private HashMap getState(){
            return state;
        }
        private void setState(HashMap state){
            this.state = state;
        }
    }
}
