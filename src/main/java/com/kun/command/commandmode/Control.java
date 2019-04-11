package com.kun.command.commandmode;

/**
 * @author kun
 * @data 2019/3/13 19:47
 */
public interface Control {
    /**
     * 开
     * @param slot 插槽位
     */
    public void onButton(int slot);

    /**
     * 关
     * @param slot 插槽位
     */
    public void offButton(int slot);

    /**
     * 回退
     */
    public void undoButton();
}
