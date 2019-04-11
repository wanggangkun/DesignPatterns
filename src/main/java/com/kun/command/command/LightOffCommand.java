package com.kun.command.command;

import com.kun.command.device.Light;

/**
 * @author kun
 * @data 2019/3/13 19:40
 */
public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
