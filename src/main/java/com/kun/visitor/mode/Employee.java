package com.kun.visitor.mode;

/**
 * @author kun
 * @data 2019/4/9 17:28
 */
public class Employee extends Element{
    private String name;
    private float income;
    private int vacationDays;
    private int degree;

    public Employee(String name, float income, int vacationDays, int degree) {
        this.name = name;
        this.income = income;
        this.vacationDays = vacationDays;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
