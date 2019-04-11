package com.kun.bridge.control;

/**
 * @author kun
 * @data 2019/3/27 17:34
 */
public class SharpControl implements Control {
    public void on() {
        System.out.println("***Open Sharp TV***");
    }

    public void off() {
        System.out.println("***Off Sharp TV***");
    }

    public void setChannel(int ch) {
        System.out.println("***The Sharp TV Channel is set " + ch + "***");
    }

    public void setVolume(int vol) {
        System.out.println("***The Sharp TV Volume is set " + vol + "***");
    }
}
