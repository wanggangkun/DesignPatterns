package com.kun.state.state;

/**
 * @author kun
 * @data 2019/3/21 19:04
 */
public interface State {
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
}
