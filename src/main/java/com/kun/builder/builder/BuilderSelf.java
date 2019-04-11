package com.kun.builder.builder;

import com.kun.builder.vacation.Vocation;

/**
 * @author kun
 * @data 2019/3/28 19:07
 */
public class BuilderSelf {
    private Vocation vocation;
    public BuilderSelf(String  std){
        vocation = new Vocation(std);
    }
    public BuilderSelf addDay(){
        vocation.addDay();
        return this;
    }
    public BuilderSelf buildDay(int i) {
        vocation.setVacationDay(i);
        return this;
    }
    public BuilderSelf addHotel(String hotel) {
        vocation.setHotel(hotel);
        return this;
    }
    public BuilderSelf addTicket(String ticket) {
        vocation.addTicket(ticket);
        return this;
    }
    public BuilderSelf addEvent(String event) {
        vocation.addEvent(event);
        return this;
    }
    public Vocation getVocation(){
        return vocation;
    }
}
