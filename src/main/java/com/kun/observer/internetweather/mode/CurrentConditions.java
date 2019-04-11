package com.kun.observer.internetweather.mode;

import com.kun.observer.internetweather.observer.Observer;

/**
 * @author kun
 * @data 2019/3/7 20:03
 * 一个观察者，播报当前天气
 */
public class CurrentConditions implements Observer {

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
        System.out.println("***Today temperature:" + temperature + "***");
        System.out.println("***Today pressure:" + pressure + "***");
        System.out.println("***Today humidity:" + humidity + "***");
    }
}
