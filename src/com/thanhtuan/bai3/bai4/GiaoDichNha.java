package com.thanhtuan.bai3.bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private String diaChi;
    private double thanhTien;

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public GiaoDichNha(){
        super();
    }

    public GiaoDichNha(int maGiaoDich, double donGia, Date ngayDG, int dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, donGia, ngayDG, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap(){
        super.nhap();
        System.out.println("nhap loai nha");

        do {
            this.loaiNha = new Scanner(System.in).nextLine();
            if(!loaiNha.equals("caocap")&&!loaiNha.equals("thuong")){
                System.out.println("nhap sai roi nhap lai di!");
            }
        }while (loaiNha.equals("caocap")&&loaiNha.equals("thuong"));
        System.out.println("nhap dia chi");
        this.diaChi= new Scanner(System.in).nextLine();
        this.thanhTienTe();
    }
    public double thanhTienTe(){

        if(this.loaiNha.equals("caocap")){
            this.thanhTien=getDonGia() * getDienTich();
        }
        else{
            this.thanhTien= 0.9*getDonGia()*getDienTich();
        }
        return thanhTien;
    }

    public void xuat(){
        super.xuat();
        System.out.println("loai nha" + this.loaiNha);
        System.out.println("dia chi" + this.diaChi);
        System.out.println("thanh tien"+ this.thanhTien);
    }


}
