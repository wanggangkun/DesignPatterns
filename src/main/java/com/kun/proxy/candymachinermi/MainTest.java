package com.kun.proxy.candymachinermi;

import java.rmi.Naming;

/**
 * @author kun
 * @data 2019/3/23 15:11
 */
public class MainTest {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        try {
            CandyMachineRemote candyMachineRemote = (CandyMachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test1");
            monitor.addMachine(candyMachineRemote);
            candyMachineRemote = (CandyMachineRemote)Naming.lookup("rmi://127.0.0.1:6602/test2");
            monitor.addMachine(candyMachineRemote);
        }catch (Exception e){
            e.printStackTrace();
        }
        monitor.report();
    }
}
