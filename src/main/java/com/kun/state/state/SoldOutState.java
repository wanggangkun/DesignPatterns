package com.kun.state.state;

/**
 * @author kun
 * @data 2019/3/21 19:07
 */
public class SoldOutState implements State{
    private CandyMachine candyMachine;
    SoldOutState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    public void insertCoin() {
        System.out.println("You can't insert coin, the machine sold out!");
    }

    public void returnCoin() {
        System.out.println("You can't return, you haven't inserted a coin yet!");
    }

    public void turnCrank() {
        System.out.println("You turned, but there are no candies!");
    }

    public void dispense() {

    }

    public void printState() {
        System.out.println("***SoldOutState***");
    }
}
