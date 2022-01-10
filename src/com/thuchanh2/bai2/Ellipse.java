package com.thuchanh2.bai2;

    // HINH_ELLIPSE

public class Ellipse extends Shape {

    private double nuatruclon;
    private double nuatrucbe;

    public Ellipse() {
    }

    public Ellipse(double a, double b) {
        this.nuatruclon = a;
        this.nuatrucbe = b;
    }

    @Override
    public double calculateArea() {
        return Math.PI*nuatruclon*nuatrucbe;
    }

    @Override
    public void showInformation() {
        System.out.println("Hình elip có nửa trục lớn là: " + this.nuatruclon + " và nửa trục bé là: " + this.nuatrucbe + ", diện tích là: " + this.calculateArea());
    }

    public double getNuatruclon() {
        return nuatruclon;
    }

    public void setNuatruclon(double nuatruclon) {
        this.nuatruclon = nuatruclon;
    }

    public double getNuatrucbe() {
        return nuatrucbe;
    }

    public void setNuatrucbe(double nuatrucbe) {
        this.nuatrucbe = nuatrucbe;
    }

}
