package com.kun.mediator.mediator;

/**
 * @author kun
 * @data 2019/4/4 17:57
 */
public class TV extends AbstractColleague {
    public TV(Mediator mediator, String name){
        super(mediator, name);
        mediator.register(name, this);
    }
    void startTV(){
        System.out.println("It's time to start TV!");
    }
    void stopTV(){
        System.out.println("Stop TV!");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
