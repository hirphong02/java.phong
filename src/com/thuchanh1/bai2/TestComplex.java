package com.thuchanh1.bai2;

public class TestComplex {
    public static void main(String[] args) {

        System.out.println("Nhap so phuc 1: ");
        Complex c1 = new Complex();
        c1.nhapComplex();
        System.out.println("Nhap so phuc 2: ");
        Complex c2 = new Complex();
        c2.nhapComplex();

        System.out.print("So phuc 1: ");
        c1.xuatComplex(c1);
        System.out.print("So phuc 2: ");
        c2.xuatComplex(c2);

        System.out.print("Tong 2 so phuc: ");
        Complex T = new Complex();
        T=T.tongComplex(c1,c2);
        T.xuatComplex(T);

        System.out.print("Tich 2 so phuc: ");
        Complex N = new Complex();
        N=N.tichComplex(c1,c2);
        N.xuatComplex(N);

        System.out.print("Hieu 2 so phuc: ");
        Complex H = new Complex();
        H=H.hieuComplex(c1,c2);
        H.xuatComplex(H);

        System.out.print("Thuong 2 so phuc: ");
        Complex C = new Complex();
        C=C.thuongComplex(c1,c2);
        C.xuatComplex(C);

        System.out.println();

        Complex c = new Complex(4,5);
        System.out.println("PhanThuc: " + c.getThuc());
        c.setThuc(4);
        System.out.println("PhanAo: " + c.getAo());
        c.setAo(5);
    }
}
