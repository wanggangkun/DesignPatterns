package com.kun.command.command;

import com.kun.command.device.Stereo;

/**
 * @author kun
 * @data 2019/3/13 19:42
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }
    public void execute() {
        stereo.Off();
    }

    public void undo() {
        stereo.On();
        stereo.SetCd();
    }
}
