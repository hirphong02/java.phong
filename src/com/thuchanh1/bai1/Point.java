package com.thuchanh1.bai1;

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Point {
    private int hoanhdo;
    private int tungdo;
    private int caodo;
    // Khởi tạo rỗng
    public Point() {
    }
    // Hàm khởi tạo 3 số thực làm tham số
    public Point(int hoanhdo, int tungdo, int caodo) {
        this.hoanhdo = hoanhdo;
        this.tungdo = tungdo;
        this.caodo = caodo;
    }
    // Hàm khởi tạo nhận một đối tượng thuộc chính lớp này làm tham số
    public Point(Point p){
        this.hoanhdo = p.hoanhdo;
        this.tungdo = p.tungdo;
        this.caodo = p.caodo;
    }

    // Em thêm tính khoảng cách giữa 2 điểm
    public Point(int hoanhdo, int tungdo) {
    }

    public int nhapInt() {
        Scanner so = new Scanner(System.in);
        int x = so.nextInt();
        return x;
    }

    public void nhapToaDo() {
        System.out.print("Nhap hoanh do: ");
        this.hoanhdo = nhapInt();
        System.out.print("Nhap tung do: ");
        this.tungdo = nhapInt();
    }

    public void xuatToaDo() {
        System.out.println("(" + this.hoanhdo +  "," + this.tungdo + ")");
    }

    public double KhoangCach(Point x, Point y) {
        double kc = sqrt((x.hoanhdo - y.hoanhdo) * (x.hoanhdo - y.hoanhdo) + (x.tungdo - y.tungdo) * (x.tungdo - y.tungdo));
        return kc;
    }

    // Get,set
    public int getHoanhdo() {
        return hoanhdo;
    }
    public void setHoanhdo(int hoanhdo) {
        this.hoanhdo = hoanhdo;
    }
    public int getTungdo() {
        return tungdo;
    }
    public void setTungdo(int tungdo) {
        this.tungdo = tungdo;
    }
    public int getCaodo() {
        return caodo;
    }
    public void setCaodo(int caodo) {
        this.caodo = caodo;
    }
}
