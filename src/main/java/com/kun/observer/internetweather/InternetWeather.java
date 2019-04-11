package com.kun.observer.internetweather;

import com.kun.observer.internetweather.mode.CurrentConditions;
import com.kun.observer.internetweather.mode.ForecastConditions;
import com.kun.observer.internetweather.mode.WeatherDataSt;

/**
 * @author kun
 * @data 2019/3/7 20:21
 */
public class InternetWeather {
    public static void main(String[] args) {

        CurrentConditions currentConditions;
        ForecastConditions forecastConditions;

        WeatherDataSt weatherDataSt;

        weatherDataSt = new WeatherDataSt();
        currentConditions = new CurrentConditions();
        forecastConditions = new ForecastConditions();

        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forecastConditions);

        //***Today temperature:30.0***
        //***Today pressure:150.0***
        //***Today humidity:40.0***
        //***tomorrow temperature:30.891836001558808***
        //***tomorrow pressure:150.34602360663416***
        //***tomorrow humidity:40.66409206605946***
        weatherDataSt.setData(30, 150, 40);

        //***tomorrow temperature:40.93064300595313***
        //***tomorrow pressure:250.59521246900744***
        //***tomorrow humidity:50.121543943370924***
        weatherDataSt.removeObserver(currentConditions);
        weatherDataSt.setData(40, 250, 50);
    }
}
