package com.kun.bridge.control;

/**
 * @author kun
 * @data 2019/3/27 17:34
 */
public class LGControl implements Control {
    public void on() {
        System.out.println("***Open LG TV***");
    }

    public void off() {
        System.out.println("***Off LG TV***");
    }

    public void setChannel(int ch) {
        System.out.println("***The LG TV Channel is set " + ch + "***");
    }

    public void setVolume(int vol) {
        System.out.println("***The LG TV Volume is set " + vol + "***");
    }
}
