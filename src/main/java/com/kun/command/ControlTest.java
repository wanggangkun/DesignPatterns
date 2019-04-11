package com.kun.command;

import com.kun.command.command.*;
import com.kun.command.device.Light;
import com.kun.command.device.Stereo;

/**
 * @author kun
 * @data 2019/3/13 19:55
 */
public class ControlTest {
    public static void main(String[] args) {
        CommandModeControl control = new CommandModeControl();
        MarcoCommand onMarco, offMarco;
        Light bedroomLight = new Light("BedRoom");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        Command[] onCommands = {bedroomLightOn, kitchenLightOn};
        Command[] offCommands = {bedroomLightOff, kitchenLightOff};
        onMarco = new MarcoCommand(onCommands);
        offMarco = new MarcoCommand(offCommands);

        StereoOnCommand stereo1On = new StereoOnCommand(stereo);
        StereoOffCommand stereo1Off = new StereoOffCommand(stereo);
        StereoAddVolCommand stereoAddVol = new StereoAddVolCommand(stereo);
        StereoSubVolCommand stereoSubVol = new StereoSubVolCommand(stereo);

        control.setCommand(0, bedroomLightOn, bedroomLightOff);
        control.setCommand(1, kitchenLightOn, kitchenLightOff);
        control.setCommand(2, stereo1On, stereo1Off);
        control.setCommand(3, stereoAddVol, stereoSubVol);
        control.setCommand(4, onMarco, offMarco);

        control.onButton(0);
        control.undoButton();
        control.onButton(1);
        control.offButton(1);
        control.onButton(2);
        control.onButton(3);
        control.offButton(3);
        control.undoButton();
        control.offButton(2);
        control.undoButton();
        control.onButton(4);
        control.offButton(4);
    }
}
