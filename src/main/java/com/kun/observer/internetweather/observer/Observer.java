package com.kun.observer.internetweather.observer;

/**
 * @author kun
 * @data 2019/3/7 19:57
 */
public interface Observer {
    /**
     * 更新天气
     * @param temperature 温度
     * @param pressure  压力
     * @param humidity 湿度
     */
    public void update(float temperature, float pressure, float humidity);
}
