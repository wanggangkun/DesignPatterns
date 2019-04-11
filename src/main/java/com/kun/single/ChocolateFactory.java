package com.kun.single;

/**
 * @author kun
 * @data 2019/3/10 20:59
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;
    public volatile static ChocolateFactory uniqueInstance = null;
    private ChocolateFactory(){
        empty = true;
        boiled = false;
    }
    public static ChocolateFactory getInstance(){
        if (uniqueInstance == null){
            synchronized (ChocolateFactory.class){
                if (uniqueInstance == null){
                    uniqueInstance = new ChocolateFactory();
                }
            }
        }
        return uniqueInstance;
    }
    public void fill(){
        if (empty){
            // 添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if ((!empty)&&boiled){
            // 排除巧克力动作
            empty = true;
        }
    }
    public void boil(){
        if ((!empty)&&(!boiled)){
            // 煮沸咖啡
            boiled = true;
        }
    }
}
