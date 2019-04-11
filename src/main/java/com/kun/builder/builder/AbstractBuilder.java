package com.kun.builder.builder;

import com.kun.builder.vacation.Vocation;

/**
 * @author kun
 * @data 2019/3/28 17:39
 */
public abstract class AbstractBuilder {
    Vocation vocation;
    AbstractBuilder(String std){
        vocation = new Vocation(std);
    }

    /**
     * 构建假期
     */
    public abstract void buildVacation();
    public abstract void buildDay(int i);

    /**
     * 添加酒店
     * @param hotel 酒店
     */
    public abstract void addHotel(String hotel);

    /**
     * 添加票
     * @param ticket 票
     */
    public abstract void addTicket(String ticket);

    /**
     * 添加事件
     * @param event 事件
     */
    public abstract void addEvent(String event);
    public Vocation getVocation(){
        return vocation;
    }
}
