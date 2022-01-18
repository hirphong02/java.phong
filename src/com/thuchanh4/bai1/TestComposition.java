package com.thuchanh4.bai1;

import com.thuchanh4.bai1.*;

public class TestComposition {
        public static void main(String[] args) {

            Point point = new Point(3.2, 4);
            Line line = new Line(1.3, 2);
            Circle circle = new Circle(6);
            Rectangular rectangular = new Rectangular(4, 3);
            Graphic graphic = new Graphic();

            graphic.add(point);
            graphic.add(line);
            graphic.add(circle);
            graphic.add(rectangular);
            graphic.showListShape();
            graphic.getChild(1);
            graphic.remove();
        }
}
