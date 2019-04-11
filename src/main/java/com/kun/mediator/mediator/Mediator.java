package com.kun.mediator.mediator;

/**
 * @author kun
 * @data 2019/4/4 17:50
 */
public interface Mediator {
    /**
     * 注册
     * @param colleagueName 名字
     * @param colleague 类型
     */
    public abstract void register(String colleagueName, AbstractColleague colleague);

    /**
     * 得到消息
     * @param stateChange 状态
     * @param colleagueName 名字
     */
    public abstract void getMessage(int stateChange, String colleagueName);
    public abstract void sendMessage();
}
