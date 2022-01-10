package com.thuchanh4;

    public class Line extends Shape{


        private double pointA;
        private double pointB;

        public Line () {
        }

        public Line (Double pointA, double pointB) {
            this.pointA = pointA;
            this.pointB = pointB;
        }

        public Line clone() {
            try {
                return (Line) super.clone();
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
            System.out.println("remove line");
        }

        @Override
        public void getChild(int c) {
            System.out.println("getChild line");
        }

        @Override
        public String showInfo() {
            return "Point: " + ", PointA = " + pointA + ",PointB" + pointB;
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
