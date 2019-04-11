package com.kun.bridge.control;

/**
 * @author kun
 * @data 2019/3/27 17:34
 */
public class SonyControl implements Control {
    public void on() {
        System.out.println("***Open Sony TV***");
    }

    public void off() {
        System.out.println("***Off Sony TV***");
    }

    public void setChannel(int ch) {
        System.out.println("***The Sony TV Channel is set " + ch + "***");
    }

    public void setVolume(int vol) {
        System.out.println("***The Sony TV Volume is set " + vol + "***");
    }
}
