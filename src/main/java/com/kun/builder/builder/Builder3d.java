package com.kun.builder.builder;

/**
 * @author kun
 * @data 2019/3/28 17:43
 */
public class Builder3d extends AbstractBuilder{
    public Builder3d(String std) {
        super(std);
    }

    @Override
    public void buildVacation() {
        addTicket("Plane Ticket");
        addEvent("Fly to Destination");
        addEvent("supper");
        addEvent("Dancing");
        addHotel("Four Seasons");
        vocation.addDay();
        addTicket("Theme Park");
        addEvent("Bus to Park");
        addEvent("Lunch");
        addHotel("Four Seasons");
        vocation.addDay();
        addTicket("Plane Ticket");
        addEvent("City Tour");
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
