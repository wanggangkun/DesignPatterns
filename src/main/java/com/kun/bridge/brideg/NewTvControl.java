package com.kun.bridge.brideg;

import com.kun.bridge.control.Control;

/**
 * @author kun
 * @data 2019/3/27 17:36
 */
public class NewTvControl extends AbstractTvControls {
    private int ch = 0;
    private boolean isOn = false;
    private int preCh = 0;

    public NewTvControl(Control control){
        super(control);
    }
    @Override
    public void onOff(){
        if (isOn){
            isOn = false;
            control.off();
        }
    }

    @Override
    public void nextChannel() {
        preCh = ch;
        ch++;
        control.setChannel(ch);
    }

    @Override
    public void preChannel() {
        preCh = ch;
        ch--;
        if (ch < 0){
            ch = 200;
        }
        control.setChannel(ch);
    }

    public void setChannel(int nch){
        preCh = ch;
        ch = nch;
        control.setChannel(ch);
    }

    public void back(){
        control.setChannel(preCh);
    }
}
