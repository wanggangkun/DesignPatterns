package com.kun.proxy.candymachinermi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author kun
 * @data 2019/3/21 19:06
 */
public class CandyMachine extends UnicastRemoteObject implements CandyMachineRemote {
    State soldOutState;
    State onReadyState;
    State hasCoin;
    State soldState;
    State winnerState;
    private String location;
    private State state;
    private int count;
    public CandyMachine(String location, int count) throws RemoteException{
        this.location = location;
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

    public String getLocation(){
        return location;
    }

    public int getCount(){
        return count;
    }

    public State getState(){
        return state;
    }

    public void printState(){
        state.printState();
    }
}
