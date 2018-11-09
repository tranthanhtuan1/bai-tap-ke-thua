package com.thanhtuan.bai3.bai2;

import java.util.Scanner;

public class SachThamKhao extends Sach {
    private double thue;
    private double thanhTien;

    public double getThue() {
        return this.thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public SachThamKhao() {

    }

    public SachThamKhao(int maSach, int soLuong, double donGia, String nhaXuatBan, double thue) {
        super(maSach, soLuong, donGia, nhaXuatBan);
        this.thue = thue;
        this.thanhTien= thanhTien;
    }

    public void nhapSachThamKhao() {
        super.nhap();
        System.out.println("nhap thue");
        this.thue = (new Scanner(System.in)).nextDouble();
        this.thanhTien();
    }

    public double thanhTien() {
        return this.thanhTien= getDonGia() * getSoLuong() + getThue();
    }
    public void xuat(){
        super.xuat();
        System.out.println("thue"+ this.thue);
        System.out.println("thanh tien"+ this.thanhTien);
    }

}
