package com.kun.chainofresponsibility.chainms;

/**
 * @author kun
 * @data 2019/4/1 20:13
 */
public class PresidentApprover extends AbstractApprover {
    public PresidentApprover(String name){
        super(name + " President");
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        if (50000 <= request.getSum()){
            System.out.println("**This request " + request.getID() + " will be handled by " + this.name + " **");
        }else {
            successor.processRequest(request);
        }
    }
}
