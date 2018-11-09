package com.thanhtuan.bai3.bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    private double thanhTien;

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public GiaoDichDat(){
        super();
        this.loaiDat = "";
    }
    public GiaoDichDat(int maGiaoDich, double donGia, Date ngayDG, int dienTich, String loaiDat) {
        super(maGiaoDich, donGia, ngayDG, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat(){
        return loaiDat;
    }
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    public void nhap(){
        super.nhap();
        System.out.println("nhap cac loai dat");
        this.loaiDat = new Scanner(System.in).nextLine();
        do {
           if(!loaiDat.equals("A")&& !
                   loaiDat.equals("B")&&!loaiDat.equals("C")){
               System.out.println("nhap sai roi nhap lai di");
           }
       }while (loaiDat.equals("A")&& loaiDat.equals("B")&&loaiDat.equals("C"));
        this.thanhTienTe();
    }
    public double thanhTienTe(){

        if(this.loaiDat.equals("A")){
             this.thanhTien=1.5*getDienTich()*getDonGia();
        }
        else{
             this.thanhTien=getDienTich()*getDonGia();
        }
        return thanhTien;

    }

    public void xuat(){
        super.xuat();
        System.out.println("loai dat"+ this.loaiDat);
        System.out.println("thanh tien" + this.thanhTien);
    }
}
