package com.thanhtuan.bai3.bai4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    private int maGiaoDich;
    private double donGia;
    private Date ngayDG;
    private int dienTich;


    public GiaoDich(){

    }

    public GiaoDich(int maGiaoDich, double donGia, Date ngayDG, int dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.donGia = donGia;
        this.ngayDG = ngayDG;
        this.dienTich = dienTich;

    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public Date getNgayDG() {
        return ngayDG;
    }
    public void setNgayDG(Date ngayDG) {
        this.ngayDG = ngayDG;
    }
    public int getDienTich() {
        return dienTich;
    }
    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }


    public void nhap(){
        System.out.println("nhap ma giao dich");
        this.maGiaoDich= new Scanner(System.in).nextInt();
        System.out.println("nhap don gia");
        this.donGia= new Scanner(System.in).nextDouble();
        System.out.println("nhap dien tich");
        this.dienTich= new Scanner(System.in).nextInt();
        System.out.println("nhap vao ngay");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            try {
                this.ngayDG= df.parse(ngay);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

    public void xuat(){
        System.out.println("ma giao dich"+ this.maGiaoDich);
        System.out.println("don gia"+ this.donGia);
        System.out.println("ngay giao dich"+ this.ngayDG);
        System.out.println("dien tich"+ this.dienTich);
    }
}



