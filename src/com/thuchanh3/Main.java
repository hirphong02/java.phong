package com.thuchanh3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Company company = new Company("BKAV Software Company", currentDate);
        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;
        Person p = new Person("Phong", 2002, male);
        Employee e1 = new Employee(p, new Date(),"Staff", 10, 1000);
        company.addNewEmployee(e1);
        company.showListEmployees();
    }

}
