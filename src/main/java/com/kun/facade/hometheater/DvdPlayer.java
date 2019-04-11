package com.kun.facade.hometheater;

/**
 * @author kun
 * @data 2019/3/17 15:48
 */
public class DvdPlayer {
    private static DvdPlayer instance = null;
    private DvdPlayer(){

    }
    static DvdPlayer getInstance(){
        if (instance == null){
            instance = new DvdPlayer();
        }
        return instance;
    }
    public void on(){
        System.out.println("DvdPlayer On");
    }
    public void off(){
        System.out.println("DvdPlayer Off");
    }
    void play(){
        System.out.println("DvdPlayer is playing");
    }
    void pause(){
        System.out.println("DvdPlayer pause");
    }
    void setDvd(){
        System.out.println("DvdPlayer is setting dvd");
    }
}
