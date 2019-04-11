package com.kun.command.device;

/**
 * @author kun
 * @data 2019/3/13 19:36
 */
public class Stereo {
    static int volume = 0;
    public void On(){
        System.out.println("Stereo on");
    }
    public void Off(){
        System.out.println("Stereo off");
    }
    public void SetCd(){
        System.out.println("Stereo SetCd");
    }
    public void SetVol(int vol){
        volume = vol;
        System.out.println("Stereo volume = " + volume);
    }
    public int GetVol(){
        return volume;
    }
    public void Start(){
        System.out.println("Stereo Start");
    }
}
