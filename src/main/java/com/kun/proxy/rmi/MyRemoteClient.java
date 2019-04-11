package com.kun.proxy.rmi;

import java.rmi.Naming;

/**
 * @author kun
 * @data 2019/3/23 14:33
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    private void go(){
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
