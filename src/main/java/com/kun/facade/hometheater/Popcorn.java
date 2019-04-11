package com.kun.facade.hometheater;

/**
 * @author kun
 * @data 2019/3/17 15:48
 */
public class Popcorn {
    private static Popcorn instance = null;
    private Popcorn(){

    }
    static Popcorn getInstance(){
        if (instance == null){
            instance = new Popcorn();
        }
        return instance;
    }
    public void on(){
        System.out.println("Popcorn On");
    }
    public void off(){
        System.out.println("Popcorn Off");
    }
    void pop(){
        System.out.println("Popcorn is popping");
    }
}
