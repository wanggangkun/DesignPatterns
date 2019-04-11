package com.kun.command.command;

import com.kun.command.device.Stereo;

/**
 * @author kun
 * @data 2019/3/13 19:42
 */
public class StereoAddVolCommand implements Command {
    private Stereo stereo;
    public StereoAddVolCommand(Stereo stereo){
        this.stereo = stereo;
    }
    public void execute() {
        int vol = stereo.GetVol();
        if (vol < 11){
            stereo.SetVol(++vol);
        }
    }

    public void undo() {
        int vol = stereo.GetVol();
        if (vol > 0){
            stereo.SetVol(--vol);
        }
    }
}
