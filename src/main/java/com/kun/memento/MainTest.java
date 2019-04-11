package com.kun.memento;

import com.kun.memento.memento.MementoCaretaker;
import com.kun.memento.memento.Originator;
import com.kun.memento.memento.Originator2;

/**
 * @author kun
 * @data 2019/4/7 17:32
 */
public class MainTest {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Originator originator = new Originator();
        Originator2 originator2 = new Originator2();
        System.out.println("***Originator***");
        originator.testState1();
        mementoCaretaker.saveMemento("Originator", originator.createMemento());
        originator.showState();
        originator.testState2();
        originator.showState();
        originator.restoreMemento(mementoCaretaker.retrieveMemento("Originator"));
        originator.showState();

        System.out.println("***Originator2***");
        originator2.testState1();
        originator2.showState();
        mementoCaretaker.saveMemento("Originator2", originator2.createMemento());
        originator2.testState2();
        originator2.showState();
        originator2.restoreMemento(mementoCaretaker.retrieveMemento("Originator2"));
        originator2.showState();

        System.out.println("***Originator&&Originator2***");
//        originator.restoreMemento(mementoCaretaker.retrieveMemento("Originator2"));
//        originator.showState();
    }
}
