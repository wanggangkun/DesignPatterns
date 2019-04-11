package com.kun.chainofresponsibility.chainms;

/**
 * @author kun
 * @data 2019/4/1 20:07
 */
public class PurchaseRequest {
    private int type = 0;
    private int number = 0;
    private float price = 0;

    PurchaseRequest(int type, int number, float price){
        this.type = type;
        this.number = number;
        this.price = price;
    }
    public int getType(){
        return type;
    }
    float getSum(){
        return number * price;
    }
    int getID(){
        return (int)(Math.random() * 1000);
    }
}
