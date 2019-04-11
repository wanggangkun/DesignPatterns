package com.kun.state;

import com.kun.state.state.CandyMachine;

/**
 * @author kun
 * @data 2019/3/21 19:39
 */
public class MainTest {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(6);
        candyMachine.printState();
        candyMachine.insertCoin();
        candyMachine.printState();
        candyMachine.turnCrank();
        candyMachine.printState();
        candyMachine.insertCoin();
        candyMachine.printState();
        candyMachine.turnCrank();
        candyMachine.printState();
    }
}
