package com.thanhtuan.bai3.bai3;

import java.util.Scanner;

public class Ngay {
    private int ngay;
    private int thang;
    private int nam;

    public int getNgay() {
        return ngay;
    }
    public int getThang() {
        return thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public Ngay(){
        this.ngay=0;
        this.thang=0;
        this.nam=0;
    }

    public void nhapNgay(){
        System.out.println("nhap ngay");
        ngay= new Scanner(System.in).nextInt();
        System.out.println("nhap thang");
        thang= new Scanner(System.in).nextInt();
        System.out.println("nhap nam");
        nam= new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "Ngay{" +
                "ngay=" + ngay +
                ", thang=" + thang +
                ", nam=" + nam +
                '}';
    }
}
