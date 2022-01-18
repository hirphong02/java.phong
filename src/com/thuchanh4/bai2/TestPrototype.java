package com.thuchanh4.bai2;

import com.thuchanh4.bai1.Point;

public class TestPrototype {
    public static void main(String[] args) {
        Point point1 = new Point(10.0, 20) ;
        Point point2 = point1; // gọi phương thức copy
        System.out.println();
        System.out.println("Point1 có cd = " + point1.getPointA() + ", cr = " + point1.getPointB()); // điểm đã cho
        System.out.println("Sau khi copy Point2 có cd = " + point2.getPointA() + ", cr = " + point2.getPointB()); // điểm 2 copy điểm 1
    }
}
