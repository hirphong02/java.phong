package com.thuchanh3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Company {


    private String name;
    private Date dateCreate;
    private List<Employee> employees = new ArrayList<>();

    public Company(String name, Date dateCreate) {
        this.name = name;
        this.dateCreate = dateCreate;
    }

    public void showListEmployees () {
        for(Employee employee : employees) {
            System.out.println("Tên nhân viên: " + employee.getName() + " - Thời gian làm việc: " + employee.getDateJoin());
        }
    }

    public void addNewEmployee (Employee e) {
        if(employees.size() < 10 ) {
            if (e.getDateJoin().getTime() >= dateCreate.getTime()) {
                e.setDateJoin(new Date());
                employees.add(e);
            }
            else {
                System.out.println("Thêm thất bại!");
            }
        }else {
            info();
        }
    }

    public void info() {
        if(employees.size() >= 10 ) {
            System.out.println("Công ty đã tuyển tối đa số người !");
        }
    }

    public String getName() {
        return name;
    }


}
