package com.kun.proxy.candymachinermi;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * @author kun
 * @data 2019/3/23 15:07
 */
class Monitor {
    private ArrayList<CandyMachineRemote> candyMachineList;
    Monitor(){
        candyMachineList = new ArrayList<CandyMachineRemote>();
    }
    void addMachine(CandyMachineRemote candyMachineRemote){
        candyMachineList.add(candyMachineRemote);
    }
    void report(){
        CandyMachineRemote candyMachineRemote;
        for (CandyMachineRemote aCandyMachineList : candyMachineList) {
            candyMachineRemote = aCandyMachineList;
            try {
                System.out.println("Machine Loc: " + candyMachineRemote.getLocation());
                System.out.println("Machine Candy count:" + candyMachineRemote.getCount());
                System.out.println("Machine State:" + candyMachineRemote.getState().getStateName());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
