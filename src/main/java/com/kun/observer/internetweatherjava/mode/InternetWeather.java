package com.kun.observer.internetweatherjava.mode;

/**
 * @author kun
 * @data 2019/3/7 20:21
 */
public class InternetWeather {
    public static void main(String[] args) {

        CurrentConditions currentConditions;
        ForecastConditions forecastConditions;

        WeatherData weatherData;

        weatherData = new WeatherData();
        currentConditions = new CurrentConditions();
        forecastConditions = new ForecastConditions();

        weatherData.addObserver(currentConditions);
        weatherData.addObserver(forecastConditions);

        //***tomorrow temperature:30.125918703833694***
        //***tomorrow pressure:150.11244502977323***
        //***tomorrow humidity:40.770127319029925***
        //***Today temperature:30.0***
        //***Today pressure:150.0***
        //***Today humidity:40.0***
        weatherData.setData(30, 150, 40);

        //***tomorrow temperature:40.34174830334587***
        //***tomorrow pressure:250.80526711535447***
        //***tomorrow humidity:50.011637872817055***
        weatherData.deleteObserver(currentConditions);
        weatherData.setData(40, 250, 50);
    }
}
