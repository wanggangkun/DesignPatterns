package com.kun.proxy.candymachinermi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author kun
 * @data 2019/3/23 14:46
 */
public interface CandyMachineRemote extends Remote {
    /**
     * 获取位置
     * @return 位置
     * @throws RemoteException 异常
     */
    public String getLocation() throws RemoteException;

    /**
     * 获取糖果个数
     * @return 个数
     * @throws RemoteException 异常
     */
    public int getCount() throws RemoteException;

    /**
     * 获取状态
     * @return 状态
     * @throws RemoteException 异常
     */
    public State getState() throws RemoteException;
}
