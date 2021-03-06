package com.thuchanh4.bai1;

public class Circle extends Shape {

        private double r;

        public Circle(double r) {
            this.r = r;
        }

         public Circle copy(Circle circle) {
           this.r = circle.r ;
           return circle;
    }

        public Circle clone() {
            try {
                return (Circle) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public void operation() {
            System.out.println("operration line");
        }

        @Override
        public void add(Shape e) {
            System.out.println("add line");
        }

        @Override
        public void remove() {
            System.out.println("remove point");
        }

        @Override
        public void getChild(int c) {
            System.out.println("getChild line");
        }

        @Override
        public String showInfo() {
            return  "Hình tròn có bán kính = " + this.r ;
        }

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }
    }

