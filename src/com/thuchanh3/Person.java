package com.thuchanh3;

public class Person {

    private static int uniqueId = 0;

    private int id;
    private String name;
    private int yearOfBirth;
    private String gender;

    public Person(String name, int yearOfBirth, Gender gender) {

        this.id = uniqueId++;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = String.valueOf(gender);
    }

    public Person(Person p) {
        this.id = uniqueId++;
        this.name = p.name;
        this.yearOfBirth = p.yearOfBirth;
        this.gender = p.gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return  yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String display () {
        return "Định danh: " + this.id + ", tên: " + this.name + ", năm sinh: " + this.yearOfBirth + ", giới tính: " + this.gender;
    }
}
