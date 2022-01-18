package com.thuchanh4.bai1;

public class Rectangular extends Shape {

    private double cd;
    private double cr;

    public Rectangular (double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public Rectangular copy(Rectangular rectangular) {
        this.cd = rectangular.cd;
        this.cr = rectangular.cr;
        return rectangular;
    }

    public Rectangular clone() {
        try {
            return (Rectangular) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void operation() {
        System.out.println("operation rectangular");
    }

    @Override
    public void add(Shape e) {
        System.out.println("add rectangular");
    }

    @Override
    public void remove() {
        System.out.println("remove rectangular");
    }

    @Override
    public void getChild(int c) {
        System.out.println("get child rectangular");
    }

    @Override
    public String showInfo() {
        return "Hình chữ nhật có chiều dài = " + this.cd + ", chiều rộng = " + this.cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }
}
