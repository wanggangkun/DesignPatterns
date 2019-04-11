package com.kun.bridge.control;

/**
 * @author kun
 * @data 2019/3/27 17:33
 */
public interface Control {
    /**
     * 开
     */
    public void on();

    /**
     * 关
     */
    public void off();

    /**
     * 设置频道
     * @param ch 频道
     */
    public void setChannel(int ch);
    public void setVolume(int vol);
}
