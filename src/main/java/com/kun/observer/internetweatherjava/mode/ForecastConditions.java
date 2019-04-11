package com.kun.observer.internetweatherjava.mode;

import java.util.Observable;
import java.util.Observer;

/**
 * @author kun
 * @data 2019/3/7 20:07
 * 一个观察者，播报明天的天气
 */
public class ForecastConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    private void display(){
        System.out.println("***tomorrow temperature:" + (temperature + Math.random()) + "***");
        System.out.println("***tomorrow pressure:" + (pressure + Math.random()) + "***");
        System.out.println("***tomorrow humidity:" + (humidity + Math.random()) + "***");
    }

    public void update(Observable o, Object arg) {
        this.temperature = ((WeatherData.Data)(arg)).temperature;
        this.pressure = ((WeatherData.Data)(arg)).pressure;
        this.humidity = ((WeatherData.Data)(arg)).humidity;
        display();
    }
}
