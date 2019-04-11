package com.kun.builder.vacation;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author kun
 * @data 2019/3/28 17:20
 */
public class VacationDay {
    private Date date;
    private String hotels;
    private ArrayList<String> tickets = null;
    private ArrayList<String> events = null;
    VacationDay(Date date){
        this.date = date;
        this.tickets = new ArrayList<String>();
        this.events = new ArrayList<String>();
    }
    public void setDate(Date date){
        this.date = date;
    }
    void setHotels(String hotels){
        this.hotels = hotels;
    }
    void addTicket(String ticket){
        tickets.add(ticket);
    }
    void addEvent(String event){
        events.add(event);
    }
    String showInfo(){
        return ("Date:" + date.toString() + "\n") +
                "Hotel:" + hotels + "\n" +
                "Tickets:" + tickets.toString() + "\n" +
                "Events:" + events.toString() + "\n";
    }
}
