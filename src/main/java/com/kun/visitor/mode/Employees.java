package com.kun.visitor.mode;

import java.util.HashMap;

/**
 * @author kun
 * @data 2019/4/9 17:34
 */
public class Employees {
    private HashMap<String, Employee> employees;
    public Employees(){
        employees = new HashMap<String, Employee>();
    }
    public void attach(Employee employee){
        employees.put(employee.getName(), employee);
    }
    public void Detach(Employee employee){
        employees.remove(employee);
    }
    public Employee getEmployee(String name){
        return employees.get(name);
    }
    public void accept(Visitor visitor){
        for (Employee e: employees.values()){
            e.accept(visitor);
        }
    }
}
