package com.kun.builder.vacation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @author kun
 * @data 2019/3/28 17:26
 */
public class Vocation {
    private ArrayList<VacationDay> vacationDaysList;
    private Date date;
    private int days = 0;
    private VacationDay vacationDay;
    public Vocation(String std){
        vacationDaysList = new ArrayList<VacationDay>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse(std);
            vacationDay = new VacationDay(date);
            vacationDaysList.add(vacationDay);
        }catch (ParseException e){
            e.getErrorOffset();
        }
    }
    public void setDate(String std){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse(std);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public Date getDate(){
        return date;
    }
    public void addDay(){
        vacationDay = new VacationDay(nextDate(days));
        vacationDaysList.add(vacationDay);
        days++;
    }
    public boolean setVacationDay(int i){
        if ((i > 0) && (i < vacationDaysList.size())){
            vacationDay = vacationDaysList.get(i);
            return true;
        }
        vacationDay = null;
        return false;
    }

    private Date nextDate(int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, n);
        return calendar.getTime();
    }
    public void addEvent(String event){
        vacationDay.addEvent(event);
    }
    public void setHotel(String hotel){
        vacationDay.setHotels(hotel);
    }
    public void addTicket(String ticket){
        vacationDay.addTicket(ticket);
    }
    public void showInfo(){
        for (int i=0, len=vacationDaysList.size(); i<len; i++){
            System.out.println("** " + (i + 1) + " day**");
            System.out.println(vacationDaysList.get(i).showInfo());
        }
    }
}
