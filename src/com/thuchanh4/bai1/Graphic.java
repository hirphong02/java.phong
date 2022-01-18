package com.thuchanh4.bai1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

    public class Graphic extends Shape {

    private List<Shape> shapes = new ArrayList<>();

    public Graphic() {
    }

    public void showListShape() {
        for (Shape shape: shapes) {
            System.out.println(shape.showInfo());
        }
    }

    public Graphic clone() {
        try {
            return (Graphic) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void operation() {
        for (Shape shape: shapes) {
            shape.operation();
        }
    }

    @Override
    public void add(Shape shape) {
        try {
            shapes.add(shape);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove() {
        System.out.println("Chọn shape bạn muốn xóa");
        Scanner scanner = new Scanner(System.in);
        int choose = 0, index = 0 ;
        for (Shape shape: shapes) {
            System.out.println(++index + ". " + shape.showInfo());
        }
        System.out.print("Muốn xóa shape thứ: ");
        choose = scanner.nextInt();
        shapes.remove(--choose);
        System.out.println("Danh sách sau khi xóa: ");
        showListShape();
    }

    @Override
    public void getChild(int a) {
        System.out.println();
        System.out.println("Shape tại vị trí " + a + " là: " + shapes.get(a).showInfo());;
        System.out.println();
    }

    @Override
        public String showInfo() {
        return "Graphic";
    }
}
