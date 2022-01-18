package com.thuchanh4.bai1;

public class Point extends Shape {

    private double pointA;
    private double pointB;

    public Point(int i) {
    }

    public Point (Double pointA, double pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point copy(Point point) {
        this.pointA = point.pointA ;
        this.pointB = point.pointB;
        return point;
    }

    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void operation(){
        System.out.println("operation point");
    }

    @Override
    public void add(Shape e) {
        System.out.println("add point");
    }

    @Override
    public void remove() {
        System.out.println("remove point");
    }

    @Override
    public void getChild(int c) {
        System.out.println("getChild point");
    }

    @Override
    public String showInfo() {
        return  "Point: " + "PointA = " + pointA + ", PointB " +pointB;
    }

    public double getPointA() {
        return pointA;
    }

    public void setPointA(double pointA) {
        this.pointA = pointA;
    }

    public double getPointB() {
        return pointB;
    }

    public void setPointB(double pointB) {
        this.pointB = pointB;
    }
}

