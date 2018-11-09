package com.thanhtuan.bai3.bai2;

import java.util.Scanner;

public class Sach {
    private int maSach;
    private int soLuong;
    private double donGia;
    private String nhaXuatBan;
    Ngay ngayNhap = new Ngay();

    public int getMaSach() {
        return this.maSach;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public String getNhaXuatBan() {
        return this.nhaXuatBan;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public Sach() {
        this.soLuong = 0;
        this.nhaXuatBan = "";
        this.donGia = 0;
        this.maSach = 0;
    }

    public Sach(int maSach, int soLuong, double donGia, String nhaXuatBan) {
        this.maSach = maSach;
        this.donGia = donGia;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
    }

    public void nhap() {
        System.out.println("nhap thong tin sach");
        System.out.println("ma so sach");
        this.maSach = (new Scanner(System.in)).nextInt();
        System.out.println("nha xuat ban");
        this.nhaXuatBan = (new Scanner(System.in)).nextLine();
        System.out.println("ngay nhap");
        this.ngayNhap.nhap();
        System.out.println("don gia");
        this.donGia = (new Scanner(System.in)).nextDouble();
        System.out.println("so luong");
        this.soLuong = (new Scanner(System.in)).nextInt();
    }
    public void xuat(){
        System.out.println("ma sach"+ this.maSach);
        System.out.println("nha xuat ban"+ this.nhaXuatBan);
        System.out.println("ngay nhap"+ this.ngayNhap);
        System.out.println("don gia"+this.donGia);
        System.out.println("so luong"+this.soLuong);
    }



}
