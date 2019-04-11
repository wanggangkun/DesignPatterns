package com.kun.builder.builder;

/**
 * @author kun
 * @data 2019/3/28 17:43
 */
public class Builder4d extends AbstractBuilder{
    public Builder4d(String std) {
        super(std);
    }

    @Override
    public void buildVacation() {
        addTicket("Plane Ticket");
        addEvent("Fly to Destination");
        addEvent("Supper");
        addEvent("Dancing");
        addHotel("Four Seasons");
        vocation.addDay();
        addTicket("Zoo Ticket");
        addEvent("Bus to Park");
        addEvent("Feed animals");
        addHotel("Hilton");
        vocation.addDay();
        addTicket("Beach");
        addEvent("Swimming");
        addHotel("Home inn");
        vocation.addDay();
        addTicket("Plane Ticket");
        addEvent("Fly to Home");
    }

    @Override
    public void buildDay(int i) {
        vocation.setVacationDay(i);
    }

    @Override
    public void addHotel(String hotel) {
        vocation.setHotel(hotel);
    }

    @Override
    public void addTicket(String ticket) {
        vocation.addTicket(ticket);
    }

    @Override
    public void addEvent(String event) {
        vocation.addEvent(event);
    }
}
