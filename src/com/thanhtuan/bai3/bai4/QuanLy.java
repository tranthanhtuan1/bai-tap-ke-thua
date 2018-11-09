package com.thanhtuan.bai3.bai4;

import java.util.Scanner;

public class QuanLy {
    private GiaoDichNha[] giaoDichNhas;
    private GiaoDichDat[] giaoDichDats;
    private int soLuongGiaoDichNha;
    private int soLuongGiaoDichDat;
    public QuanLy(){
        giaoDichNhas = new GiaoDichNha[100];
        giaoDichDats = new GiaoDichDat[100];
        soLuongGiaoDichDat = 0;
        soLuongGiaoDichNha = 0;
    }

    public QuanLy(int soLuongGiaoDichDat,int soLuongGiaoDichNha){
        this.soLuongGiaoDichDat= soLuongGiaoDichDat;
        this.soLuongGiaoDichNha=soLuongGiaoDichNha;
        this.giaoDichDats= new GiaoDichDat[this.soLuongGiaoDichDat];
        this.giaoDichNhas= new GiaoDichNha[this.soLuongGiaoDichNha];
    }
    public void nhapDanhSachGiaoDichNha(){
        //System.out.println("so luong giao dich");
        //this.soLuongGiaoDichNha = new Scanner(System.in).nextInt();
        for (int i = 0; i <this.soLuongGiaoDichNha ; i++) {
            this.giaoDichNhas[i]= new GiaoDichNha();
            this.giaoDichNhas[i].nhap();
        }
    }
    public void xuatDanhSachGiaoDichNha(){
        for (int i = 0; i <this.soLuongGiaoDichNha ; i++) {
            this.giaoDichNhas[i].xuat();
        }
    }
    public void nhapDanhSachGiaoDichDat(){
        for (int i = 0; i <this.soLuongGiaoDichDat ; i++) {
            this.giaoDichDats[i]= new GiaoDichDat();
            this.giaoDichDats[i].nhap();
        }
    }
    public void xuatDanhSachGiaoDichDat(){
        for (int i = 0; i <this.soLuongGiaoDichDat ; i++) {
            this.giaoDichDats[i].xuat();
        }
    }
    public double tongThanhTienGiaoDichDat(){
        double tong=0;
        for (int i = 0; i <this.soLuongGiaoDichDat ; i++) {
            tong+=this.giaoDichDats[i].thanhTienTe();
        }
        return tong;
    }
    public double tbThanhTienGiaoDichDat(){
        return tongThanhTienGiaoDichDat()/this.soLuongGiaoDichDat;
    }


}
