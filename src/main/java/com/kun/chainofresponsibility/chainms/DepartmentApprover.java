package com.kun.chainofresponsibility.chainms;

/**
 * @author kun
 * @data 2019/4/1 20:13
 */
public class DepartmentApprover extends AbstractApprover {
    public DepartmentApprover(String name){
        super(name + " DepartmentLeader");
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        if ((5000<= request.getSum()) && (request.getSum() < 10000)){
            System.out.println("**This request " + request.getID() + " will be handled by " + this.name + " **");
        }else {
            successor.processRequest(request);
        }
    }
}
