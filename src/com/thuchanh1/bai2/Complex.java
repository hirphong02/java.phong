package com.thuchanh1.bai2;

import java.util.Scanner;

public class Complex {
    private float thuc;
    private float ao;
    // Tham chiếu rỗng
    public Complex() {
    }

    // Nhận 1 sô thực làm tham số
    public Complex(float thuc) {
        this.thuc = thuc;
    }

    // Nhận 2 số thực làm tham số
    public Complex(float thuc, float ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    // Phương thức khởi tạo nhận một đối tượng thuộc chính lớp này làm tham số
    public Complex(Complex c) {
        this.thuc = c.thuc;
        this.ao = c.ao;
    }

    // Cộng trừ nhân chia hai só phức
    public float nhapInt() {
        Scanner so = new Scanner(System.in);
        float x = so.nextFloat();
        return x;
    }

    public Complex nhapComplex() {
        System.out.print("Phan Thuc: ");
        this.thuc = nhapInt();
        System.out.print("Phan ao: ");
        this.ao = nhapInt();
        return null;
    }

    public void xuatComplex(Complex A) {
        System.out.println(A.thuc + "+" + A.ao+"i");
    }

    public Complex tongComplex(Complex c1, Complex c2) {
        Complex C = new Complex();
        C.thuc = c1.thuc + c2.thuc;
        C.ao = c1.ao + c2.ao;
        return C;
    }

    public Complex tichComplex(Complex c1, Complex c2) {
        Complex C = new Complex();
        C.thuc = c1.thuc * c2.thuc - c1.ao * c2.ao;
        C.ao = c1.thuc * c2.ao + c1.ao * c2.thuc;
        return C;
    }

    public Complex hieuComplex(Complex c1, Complex c2) {
        Complex C = new Complex();
        C.thuc = c1.thuc - c2.thuc;
        C.ao = c1.ao - c2.ao;
        return C;
    }

    public Complex thuongComplex(Complex c1, Complex c2) {
        Complex C = new Complex();
        C.thuc = (c1.thuc * c2.thuc + c1.ao * c2.ao) / (c2.thuc * c2.thuc + c2.ao * c2.ao);
        C.ao = (c2.thuc * c1.ao - c1.thuc * c2.ao) / (c2.thuc * c2.thuc + c2.ao * c2.ao);
        return C;
    }

    // Get,set
    public float getThuc() {
        return thuc;}
    public void setThuc(float thuc) {
        this.thuc = thuc;}
    public float getAo() {
        return ao;}
    public void setAo(float ao) {
        this.ao = ao;}
}
