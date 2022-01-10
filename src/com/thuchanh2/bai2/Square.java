package com.thuchanh2.bai2;

    // HÌNH_VUÔNG

    public class Square extends Shape{

        private double canh;

        public Square () {
        }

        public Square (double canh) {
            this.canh = canh;
        }

        @Override
        public double calculateArea() {
            return this.canh * this.canh ;
        }


        @Override
        public void showInformation() {
            System.out.println("Hình Vuong co canh là: " + this.canh + ", diện tích là: " + this.calculateArea());
        }

        public double getCanh() {
            return canh;
        }

        public void setCanh(double canh) {
            this.canh = canh;
        }
    }
