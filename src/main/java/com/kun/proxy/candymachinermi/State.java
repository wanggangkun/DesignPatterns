package com.kun.proxy.candymachinermi;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * @author kun
 * @data 2019/3/21 19:04
 */
public interface State extends Serializable {
    /**
     * 插入硬币
     */
    public void insertCoin();

    /**
     * 退回硬币
     */
    public void returnCoin();

    /**
     * 转摇杆
     */
    public void turnCrank();

    /**
     * 发糖果
     */
    public void dispense();

    /**
     * 打印状态
     */
    public void printState();

    /**
     * 获取状态
     * @return 状态
     */
    public String getStateName();
}
