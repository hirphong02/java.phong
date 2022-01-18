package com.thuchanh3;

import java.util.Date;

public class Employee extends Person {

    private int id;
    private Date dateJoin;
    private String position;
    private double salaryLevel;
    private double basicSalary;


    public Employee (Person p, Date dateJoin, String position, double salaryLevel, double basicSalary) {
        super(p);
        this.id = p.getId();
        this.dateJoin = dateJoin;
        this.position = position;
        this.salaryLevel = salaryLevel;
        this.basicSalary = basicSalary;
    }

    public double getIncome() {
        return salaryLevel * basicSalary;
    }

    public Date getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(Date dateJoin) {
        this.dateJoin = dateJoin;
    }

    public void setSalaryLevel(double salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String display() {
        return super.display() + ", ngày làm việc: " + this.dateJoin + ", vị trí: " + this.position + ", thu nhập: " + this.getIncome();
    }
}
