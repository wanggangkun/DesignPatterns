package com.kun.command.command;

import com.kun.command.device.Light;

/**
 * @author kun
 * @data 2019/3/13 19:40
 */
public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
