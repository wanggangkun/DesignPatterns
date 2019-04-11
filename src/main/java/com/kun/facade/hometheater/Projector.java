package com.kun.facade.hometheater;

/**
 * @author kun
 * @data 2019/3/17 15:48
 */
public class Projector {
    private static Projector instance = null;

    private Projector(){

    }
    static Projector getInstance(){
        if (instance == null){
            instance = new Projector();
        }
        return instance;
    }
    public void on(){
        System.out.println("Projector On");
    }
    public void off(){
        System.out.println("Projector Off");
    }
    public void focus(){
        System.out.println("Projector is focus");
    }
    public void zoom(int size){
        System.out.println("Projector zoom to " + size);
    }
}
