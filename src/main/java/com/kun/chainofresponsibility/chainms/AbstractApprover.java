package com.kun.chainofresponsibility.chainms;

/**
 * @author kun
 * @data 2019/4/1 20:10
 */
public abstract class AbstractApprover {
    AbstractApprover successor;
    String name;
    AbstractApprover(String name){
        this.name = name;
    }

    /**
     * 处理请求
     * @param request 请求
     */
    public abstract void processRequest(PurchaseRequest request);
    public void setSuccessor(AbstractApprover successor){
        this.successor = successor;
    }
}
