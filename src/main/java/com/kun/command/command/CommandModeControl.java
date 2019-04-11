package com.kun.command.command;

import com.kun.command.commandmode.Control;

import java.util.Stack;

/**
 * @author kun
 * @data 2019/3/13 19:45
 */
public class CommandModeControl implements Control {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> stack = new Stack<Command>();
    public CommandModeControl(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        Command noCommand = new NoCommand();
        for (int i=0,len=onCommands.length;i<len;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButton(int slot) {
        onCommands[slot].execute();
        stack.push(onCommands[slot]);
    }

    public void offButton(int slot) {
        offCommands[slot].execute();
        stack.push(offCommands[slot]);
    }

    public void undoButton() {
        stack.pop().undo();
    }
}
