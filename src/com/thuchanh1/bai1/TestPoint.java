package com.thuchanh1.bai1;

public class TestPoint {
    public static void main(String[] args) {

        System.out.println("Diem A ");
        Point d1 = new Point();
        d1.nhapToaDo();
        System.out.println("Diem B ");
        Point d2 = new Point();
        d2.nhapToaDo();

        System.out.println("Toa do 2 diem la ");

        System.out.print("A: ");
        d1.xuatToaDo();
        System.out.print("B: ");
        d2.xuatToaDo();

        Point kc = new Point();
        double khoangCach = kc.KhoangCach(d1,d2);
        System.out.print("Khoang cach giua diem A va B la: " + khoangCach);

        System.out.println();

        Point p = new Point(3, 4, 5);
        System.out.println("HoanhDo: " + p.getHoanhdo());
        p.getHoanhdo();
        System.out.println("TungDo: " + p.getTungdo());
        p.setTungdo(4);
        System.out.println("CaoDo: " + p.getCaodo());
        p.getCaodo();
    }
}
