package com.thuchanh6;

import com.thuchanh6.PhanSo;

public class TestPhanSo {
    public static void main(String[] args) {
        PhanSo phanso1 = new PhanSo(16, 4); // Tạo phân số có tử = 16 và mẫu = 4
        PhanSo phanso2 = new PhanSo(4, 8); // Tạo phân số có tử = 4 và mẫu = 8
        System.out.println();

        // Gọi phương thức cộng, trừ, nhân, chia 2 phân số
        try { // Bắt và trả về ngoại lỗi chia cho 0
            System.out.println("Tổng 2 phân số là: " + phanso1.add(phanso2));
            System.out.println("Hiệu 2 phân số là: " + phanso1.sub(phanso2));
            System.out.println("Tích 2 phân số là: " + phanso1.multiple(phanso2));
            System.out.println("Thương 2 phân số là: " + phanso1.divide(phanso2));

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Đối số nhập vào vào phải khác 0 ");
        }
    }
}
