package com.kun.facade.hometheater;

/**
 * @author kun
 * @data 2019/3/17 15:48
 */
public class TheaterLights {
    private static TheaterLights instance = null;
    private TheaterLights(){

    }
    static TheaterLights getInstance(){
        if (instance == null){
            instance = new TheaterLights();
        }
        return instance;
    }
    public void on(){
        System.out.println("TheaterLights On");
    }
    public void off(){
        System.out.println("TheaterLights Off");
    }
    void dim(int d){
        System.out.println("TheaterLights dim to " + d + "%");
    }
    void bright(){
        dim(100);
        System.out.println("TheaterLights bright");
    }
}
