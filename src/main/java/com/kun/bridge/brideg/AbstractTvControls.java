package com.kun.bridge.brideg;

import com.kun.bridge.control.Control;

/**
 * @author kun
 * @data 2019/3/27 17:38
 */
public abstract class AbstractTvControls {
    Control control = null;
    AbstractTvControls(Control control) {
        this.control = control;
    }

    /**
     *开关
     */
    public abstract void onOff();

    /**
     * 下一个频道
     */
    public abstract void nextChannel();

    /**
     * 前一个频道
     */
    public abstract void preChannel();
}
