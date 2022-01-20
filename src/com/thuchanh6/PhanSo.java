package com.thuchanh6;

public class PhanSo {

    private int tu;
    private int mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    // Constructor, mặc định: tu=1, mau =1
    public PhanSo() {
        this.tu = 1;
        this.mau = 1;
    }

    // Tối giản phân số
    public void toiGianPhanSo(int a, int b) {
        // Tìm UCLN
         a = tu;
         b = mau;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        // Tối giản phân số
        tu /= b;
        mau /= b;
    }

    // Cộng
    public final PhanSo add(PhanSo ps) {
        int tuso = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int mauso = this.getMau() * ps.getMau();
        PhanSo add = new PhanSo(tuso, mauso);
        add.toiGianPhanSo(tu, mau);
        return add;
    }


    // Trừ
    public final PhanSo sub(PhanSo ps) {
        int tuso = this.getTu() * ps.getMau() - ps.getTu() *this.getMau() ;
        int mauso = this.getMau() * ps.getMau() ;
        PhanSo sub = new PhanSo(tuso, mauso) ;
        sub.toiGianPhanSo(tu, mau);
        return sub;
    }

    // Nhân
    public final PhanSo multiple(PhanSo ps) {
        int tuso = this.getTu() * ps.getTu() ;
        int mauso = this.getMau() * ps.getMau() ;
        PhanSo multiple = new PhanSo(tuso, mauso);
        multiple.toiGianPhanSo(tu, mau);
        return multiple;
    }

    // Chia
    public final PhanSo divide(PhanSo ps) {

            int tuso = this.getTu() * ps.getMau();
            int mauso = this.getMau() * ps.getTu();
            PhanSo divide = new PhanSo(tuso, mauso);
            divide.toiGianPhanSo(tu, mau);
            return divide;
    }

    // toSrting
    public String toString() {
        return this.getTu() + "/" + this.getMau();
    }

    //Get,set
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
}



