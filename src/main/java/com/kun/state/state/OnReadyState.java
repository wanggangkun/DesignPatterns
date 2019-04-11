package com.kun.state.state;

/**
 * @author kun
 * @data 2019/3/21 19:07
 */
public class OnReadyState implements State{
    private CandyMachine candyMachine;
    OnReadyState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    public void insertCoin() {
        System.out.println("You have inserted a coin, next, please turn crank!");
        candyMachine.setState(candyMachine.hasCoin);
    }

    public void returnCoin() {
        System.out.println("You haven't inserted a coin yet!");
    }

    public void turnCrank() {
        System.out.println("You turned, but you haven't inserted a coin yet!");
    }

    public void dispense() {

    }

    public void printState() {
        System.out.println("***OnReadyState***");
    }
}
