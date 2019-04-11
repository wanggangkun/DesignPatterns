package com.kun.visitor.mode;

/**
 * @author kun
 * @data 2019/4/9 17:32
 */
public class CompensationVisitor implements Visitor {
    public void visit(Element element) {
        Employee employee = ((Employee)element);
        System.out.println(employee.getName() + "'s Compensation is " +
                (employee.getDegree() * employee.getVacationDays() * 10));
    }
}
