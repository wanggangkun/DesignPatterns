package com.kun.visitor;

import com.kun.visitor.mode.CompensationVisitor;
import com.kun.visitor.mode.Employee;
import com.kun.visitor.mode.Employees;

/**
 * @author kun
 * @data 2019/4/9 17:37
 */
public class MainTest {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.attach(new Employee("tom", 4500, 8, 1));
        employees.attach(new Employee("Jerry", 6500, 10, 2));
        employees.attach(new Employee("Jack", 9600, 12, 3));
        employees.accept(new CompensationVisitor());
    }
}
