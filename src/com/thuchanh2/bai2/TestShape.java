package com.thuchanh2.bai2;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class TestShape{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String choose = null;
            List<Shape> shapes = new ArrayList<>();

            do {
                System.out.println("1. Thêm hình chữ nhật ");
                System.out.println("2. Thêm hình vuông ");
                System.out.println("3. Thêm hình tròn ");
                System.out.println("4. Thêm hình ellipse ");
                System.out.println("5. Hiển thị thông tin các Shape ");
                System.out.println("6. Calculate shapes ");
                System.out.println("7. Thoát chương trình ");
                System.out.println("Vui lòng chọn chức năng từ 1 -> 7: ");
                choose = scanner.nextLine();

                switch (choose) {
                    case "1" :
                        System.out.print("Thêm cd: ");
                        double cd =Double.parseDouble(scanner.nextLine());
                        System.out.print("Thêm cr: ");
                        double cr =Double.parseDouble(scanner.nextLine());
                        Reactangle reactangle = new Reactangle(cd, cr);
                        shapes.add(reactangle);
                        System.out.println("Enter success");
                        break;
                    case "2" :
                        System.out.print("Thêm cạnh của hình vuông: ");
                        double canh = Double.parseDouble(scanner.nextLine()) ;
                        Square square = new Square(canh);
                        shapes.add(square);
                        System.out.println("Enter success");
                        break;
                    case "3" :
                        System.out.print("Thêm bán kính của hình tròn: ");
                        double r =Double.parseDouble(scanner.nextLine()) ;
                        Circle circle = new Circle(r);
                        shapes.add(circle);
                        System.out.println("Enter success");
                        break;
                    case "4" :
                        System.out.print("Thêm nửa trục lớn của hình ellipse: ");
                        double nuatruclon = Double.parseDouble(scanner.nextLine()) ;
                        System.out.print("Thêm nửa trục bé của hình ellipse: ");
                        double nuatrucbe = Double.parseDouble(scanner.nextLine());
                        Ellipse ellipse = new Ellipse(nuatruclon, nuatrucbe);
                        shapes.add(ellipse);
                        System.out.println("Enter success");
                        break;
                    case "5" :
                        double tongdientich = 0;
                        for(Iterator<Shape> i = shapes.iterator(); i.hasNext();) {
                            Shape shape = i.next();
                            tongdientich += shape.calculateArea();
                        }
                        System.out.println("Tổng diện tích của các hình = " + tongdientich);
                        break;
                    case "6" :
                        System.out.println("Thông tin các Shape");
                        for(Iterator<Shape> i = shapes.iterator(); i.hasNext();) {
                            Shape shape = i.next();
                            shape.showInformation();
                        }
                        break;
                    case "7" :
                        System.out.println("Thoát Chương Trình");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Vui lòng chọn những chức năng trong khoảng 1 -> 7");
                        break;
                }
            } while (true);
        }
    }
