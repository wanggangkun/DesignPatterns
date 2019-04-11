package com.kun.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author kun
 * @data 2019/3/23 14:26
 */
public interface MyRemote extends Remote {
    /**
     * 调用函数
     * @return 字符
     * @throws RemoteException 异常
     */
    public String sayHello() throws RemoteException;
}
