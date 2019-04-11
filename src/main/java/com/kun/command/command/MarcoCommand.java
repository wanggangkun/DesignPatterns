package com.kun.command.command;

/**
 * @author kun
 * @data 2019/3/13 20:12
 */
public class MarcoCommand implements Command {
    private Command[] commands;
    public MarcoCommand(Command[] commands){
        this.commands = commands;
    }
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undo() {
        for (int i=commands.length-1;i>=0;i--){
            commands[i].undo();
        }
    }
}
