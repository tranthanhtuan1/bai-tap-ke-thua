package com.thanhtuan.bai3.bai2;

import java.util.Scanner;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;
    public Ngay(){

    }

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public void nhap(){
        System.out.println("nhap ngay");
        this.ngay= new Scanner(System.in).nextInt();
        System.out.println("nhap thang");
        this.thang= new Scanner(System.in).nextInt();
        System.out.println("nhap nam");
        this.nam= new Scanner(System.in).nextInt();
    }
    public void xuat(){
        System.out.println("ngay"+ this.ngay);
        System.out.println("thang"+this.thang);
        System.out.println("nam"+this.nam);
    }
}
