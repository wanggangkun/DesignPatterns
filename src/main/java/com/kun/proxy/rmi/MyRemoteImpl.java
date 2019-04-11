package com.kun.proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author kun
 * @data 2019/3/23 14:27
 */

@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private MyRemoteImpl() throws RemoteException{
        super();
    }
    public String sayHello(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            LocateRegistry.createRegistry(6600);
            Naming.rebind("rmi://127.0.0.1:6600/RemoteHello", service);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
