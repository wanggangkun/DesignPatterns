package com.kun.mediator.mediator;

/**
 * @author kun
 * @data 2019/4/4 17:57
 */
public class CoffeeMachine extends AbstractColleague {
    public CoffeeMachine(Mediator mediator, String name){
        super(mediator, name);
        mediator.register(name, this);
    }
    void startCoffee(){
        System.out.println("It's time to start coffee!");
    }
    public void finishCoffee(){
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }
}
