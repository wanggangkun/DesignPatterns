package com.kun.chainofresponsibility.chainms;

/**
 * @author kun
 * @data 2019/4/1 20:13
 */
public class GroupApprover extends AbstractApprover {
    public GroupApprover(String name){
        super(name + " GroupLeader");
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getSum() < 5000){
            System.out.println("**This request " + request.getID() + " will be handled by " + this.name + " **");
        }else {
            successor.processRequest(request);
        }
    }
}
