package com.kun.facade.hometheater;

/**
 * @author kun
 * @data 2019/3/17 15:48
 */
public class Stereo {
    private static Stereo instance = null;
    private int volume = 5;
    private Stereo(){

    }
    static Stereo getInstance(){
        if (instance == null){
            instance = new Stereo();
        }
        return instance;
    }
    public void on(){
        System.out.println("Stereo On");
    }
    public void off(){
        System.out.println("Stereo Off");
    }
    private void setVolume(int vol){
        volume = vol;
        System.out.println("thr volume of Stereo is set to " + volume);
    }
    public void addVolume(){
        if (volume < 11){
            volume++;
            setVolume(volume);
        }
    }
    public void subVolume(){
        if (volume > 0){
            volume--;
            setVolume(volume);
        }
    }
}
