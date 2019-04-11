package com.kun.mediator.mediator;

/**
 * @author kun
 * @data 2019/4/4 17:51
 */
public abstract class AbstractColleague {
    private Mediator mediator;
    public String name;
    AbstractColleague(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }
    Mediator getMediator(){
        return this.mediator;
    }

    /**
     * 发送消息
     * @param stateChange 状态
     */
    public abstract void sendMessage(int stateChange);
}
