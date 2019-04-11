package com.kun.observer.internetweather.mode;

import com.kun.observer.internetweather.observer.Observer;
import com.kun.observer.internetweather.observer.Subject;

import java.util.ArrayList;

/**
 * @author kun
 * @data 2019/3/7 20:12
 * 被观察者，提供数据接口
 */
public class WeatherDataSt implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;

    public WeatherDataSt() {
        observers = new ArrayList<Observer>();
    }

    private float getTemperature() {
        return temperature;
    }

    private float getPressure() {
        return pressure;
    }

    private float getHumidity() {
        return humidity;
    }

    private void dataChange(){
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
