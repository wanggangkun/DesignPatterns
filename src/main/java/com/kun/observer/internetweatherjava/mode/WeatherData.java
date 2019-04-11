package com.kun.observer.internetweatherjava.mode;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author kun
 * @data 2019/3/7 20:12
 * 被观察者，提供数据接口
 */
class WeatherData extends Observable {

    private float temperature;
    private float pressure;
    private float humidity;

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
        // 需要设置
        this.setChanged();
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
    }

    void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    class Data{

        float temperature;
        float pressure;
        float humidity;

        Data(float temperature, float pressure, float humidity){
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
        }
    }
}
