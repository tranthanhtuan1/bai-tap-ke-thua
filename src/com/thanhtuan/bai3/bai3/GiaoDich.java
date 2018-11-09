package com.thanhtuan.bai3.bai3;

import javax.naming.Name;
import java.util.Scanner;

public class GiaoDich {
    private int maGiaoDich;
    private double donGia;
    private int soLuong;
    private Ngay ngayGD;

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public Ngay getNgayGD(){ return ngayGD;}

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void setNgayGD(Ngay ngayGD){this.ngayGD=ngayGD;}

    public GiaoDich(int maGiaoDich, double donGia, int soLuong, Ngay ngayGD) {
        this.maGiaoDich = maGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.ngayGD= ngayGD;
    }
    public GiaoDich(){
        this.ngayGD = new Ngay();
    }

    public void nhap(){
        System.out.println("nhap ma giao dich");
        this.maGiaoDich= new Scanner(System.in).nextInt();
        System.out.println("nhap don gia");
        this.donGia= new Scanner(System.in).nextDouble();
        System.out.println("nhap so luong");
        this.soLuong= new Scanner(System.in).nextInt();
        ngayGD.nhapNgay();

    }

   public void xuat(){
       System.out.println("nhap ma giao dich"+ this.maGiaoDich);
       System.out.println("nhap don gia"+ this.donGia);
       System.out.println("nhap so luong"+ this.soLuong);
       System.out.println("nhap ngay giao dich"+ this.ngayGD);
   }
}
