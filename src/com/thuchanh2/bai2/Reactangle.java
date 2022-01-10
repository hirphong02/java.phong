package com.thuchanh2.bai2;

    // HÌNH_CHỮ_NHẬT

    public class Reactangle extends Shape {

        private double cd;
        private double cr;

        public Reactangle (){
        }

        public Reactangle (double cd, double cr){
            this.cd = cd;
            this.cr = cr;
        }

    @Override
        public double calculateArea() {
            return cd * cr;
    }

    @Override
        public void showInformation() {
            System.out.println("Hình chữ nhật có cd là: " + this.cd + ", cr là: " + this.cr + ", diện tích là: " + this.calculateArea() );
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
