package com.thuchanh2.bai2;

    // HINH_TRON

public class Circle extends Shape {

        private double r;

        public Circle() {
        }

        public Circle(double r) {
            this.r = r;
        }

        @Override
        public double calculateArea() {
            return (r*r)*Math.PI;
        }

        @Override
        public void showInformation() {
            System.out.println("Hinh tron co ban kinh là: " + this.r + ", diện tích là: " + this.calculateArea());
        }

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }
    }
