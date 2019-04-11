package com.kun.mediator.mediator;

/**
 * @author kun
 * @data 2019/4/4 17:57
 */
public class Curtains extends AbstractColleague {
    public Curtains(Mediator mediator, String name){
        super(mediator, name);
        mediator.register(name, this);
    }
    void upCurtains(){
        System.out.println("I am holding up curtains!");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
