package com.kun.single;

/**
 * @author kun
 * @data 2019/3/10 20:57
 */
public class Singleton {
    private static Singleton uniqueInstance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
