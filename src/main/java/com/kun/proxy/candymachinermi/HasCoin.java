package com.kun.proxy.candymachinermi;

import java.util.Random;

/**
 * @author kun
 * @data 2019/3/21 19:07
 */
public class HasCoin implements State {
    private transient CandyMachine candyMachine;
    HasCoin(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    public void insertCoin() {
        System.out.println("You can't insert another coin!");
    }

    public void returnCoin() {
        System.out.println("Coin return!!");
        candyMachine.setState(candyMachine.onReadyState);
    }

    public void turnCrank() {
        System.out.println("Crank turn...!");
        Random random = new Random();
        int winner = random.nextInt(10);
        if (winner == 0){
            candyMachine.setState(candyMachine.winnerState);
        }else {
            candyMachine.setState(candyMachine.soldState);
        }
    }

    public void dispense() {

    }

    public void printState() {
        System.out.println("***HasCoin***");
    }

    public String getStateName() {
        return "HasCoin";
    }
}
