package com.kun.observer.internetweather.observer;

/**
 * @author kun
 * @data 2019/3/7 20:00
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
