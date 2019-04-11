package com.kun.chainofresponsibility;

import com.kun.chainofresponsibility.chainms.*;

/**
 * @author kun
 * @data 2019/4/1 20:30
 */
public class MainTest {
    public static void main(String[] args) {
        Client client = new Client();
        AbstractApprover groupLeader = new GroupApprover("Tom");
        AbstractApprover departmentLeader = new DepartmentApprover("Jerry");
        AbstractApprover vicePresident = new VicePresidentApprover("Kate");
        AbstractApprover president = new PresidentApprover("Bush");
        groupLeader.setSuccessor(departmentLeader);
        departmentLeader.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(groupLeader);
        groupLeader.processRequest(client.sendRequest(1, 100, 40));
        groupLeader.processRequest(client.sendRequest(2, 200, 40));
        groupLeader.processRequest(client.sendRequest(3, 300, 40));
        groupLeader.processRequest(client.sendRequest(4, 400, 140));
    }
}
