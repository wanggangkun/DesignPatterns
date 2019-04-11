package com.kun.observer.internetweather.mode;

import com.kun.observer.internetweather.observer.Observer;

/**
 * @author kun
 * @data 2019/3/7 20:07
 * 一个观察者，播报明天的天气
 */
public class ForecastConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display(){
        System.out.println("***tomorrow temperature:" + (temperature + Math.random()) + "***");
        System.out.println("***tomorrow pressure:" + (pressure + Math.random()) + "***");
        System.out.println("***tomorrow humidity:" + (humidity + Math.random()) + "***");
    }
}
