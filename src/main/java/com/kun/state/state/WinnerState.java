package com.kun.state.state;

/**
 * @author kun
 * @data 2019/3/21 19:07
 */
public class WinnerState implements State{
    private CandyMachine candyMachine;
    WinnerState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    public void insertCoin() {
        System.out.println("Please wait! We are giving you a candy!");
    }

    public void returnCoin() {
        System.out.println("You haven't inserted a coin yet!");
    }

    public void turnCrank() {
        System.out.println("We are giving  you a candy, turning another get nothing!");
    }

    public void dispense() {
        candyMachine.releaseCandy();
        if (candyMachine.getCount() == 0){
            candyMachine.setState(candyMachine.soldOutState);
        }else {
            System.out.println("You are a winner! You get another candy!");
            candyMachine.releaseCandy();
            if (candyMachine.getCount() > 0){
                candyMachine.setState(candyMachine.onReadyState);
            }else {
                System.out.println("On, out of candies");
                candyMachine.setState(candyMachine.soldOutState);
            }
        }
    }

    public void printState() {
        System.out.println("***WinnerState***");
    }
}
