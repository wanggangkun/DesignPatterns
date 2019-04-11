package com.kun.command.device;

/**
 * @author kun
 * @data 2019/3/13 19:35
 */
public class Light {
    String loc;
    public Light(String loc){
        this.loc = loc;
    }
    public void on(){
        System.out.println(loc + " on");
    }
    public void off(){
        System.out.println(loc + " off");
    }
}
