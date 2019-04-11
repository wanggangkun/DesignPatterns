package com.kun.chainofresponsibility.chainms;

/**
 * @author kun
 * @data 2019/4/1 20:13
 */
public class VicePresidentApprover extends AbstractApprover {
    public VicePresidentApprover(String name){
        super(name + " Vice President");
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        if ((10000<= request.getSum()) && (request.getSum() < 50000)){
            System.out.println("**This request " + request.getID() + " will be handled by " + this.name + " **");
        }else {
            successor.processRequest(request);
        }
    }
}
