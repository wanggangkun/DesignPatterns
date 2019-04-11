package com.kun.command.command;

/**
 * @author kun
 * @data 2019/3/13 19:34
 */
public interface Command {
    /**
     * 执行命令
     */
    public void execute();

    /**
     * 命令回退
     */
    public void undo();
}
