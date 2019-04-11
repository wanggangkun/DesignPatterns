package com.kun.observer.internetweatherjava.mode;

import java.util.Observable;
import java.util.Observer;

/**
 * @author kun
 * @data 2019/3/7 20:03
 * 一个观察者，播报当前天气
 */
public class CurrentConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    private void display(){
        System.out.println("***Today temperature:" + temperature + "***");
        System.out.println("***Today pressure:" + pressure + "***");
        System.out.println("***Today humidity:" + humidity + "***");
    }

    public void update(Observable o, Object arg) {
        this.temperature = ((WeatherData.Data)(arg)).temperature;
        this.pressure = ((WeatherData.Data)(arg)).pressure;
        this.humidity = ((WeatherData.Data)(arg)).humidity;
        display();
    }
}
