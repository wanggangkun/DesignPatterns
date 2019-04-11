package com.kun.state.state;

/**
 * @author kun
 * @data 2019/3/21 19:06
 */
public class CandyMachine {
    State soldOutState;
    State onReadyState;
    State hasCoin;
    State soldState;
    State winnerState;
    private State state;
    private int count = 0;
    public CandyMachine(int count){
        this.count = count;
        soldOutState = new SoldOutState(this);
        onReadyState = new OnReadyState(this);
        hasCoin = new HasCoin(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (count > 0){
            state = onReadyState;
        }else {
            state = soldOutState;
        }
    }
    void setState(State state){
        this.state = state;
    }
    public void insertCoin(){
        state.insertCoin();
    }
    public void returnCoin(){
        state.returnCoin();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    void releaseCandy(){
        if (count > 0){
            count = count - 1;
            System.out.println("A candy rolling out!");
        }
    }
    int getCount(){
        return count;
    }
    public void printState(){
        state.printState();
    }
}
