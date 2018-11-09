package com.thanhtuan.bai3.Bai5;

public class QuanLyKH {
    private KhachHangVN[] khachHangVNS;
    private KhachHangNN[] khachHangNNS;
    private int soLuongKhachHangVN;
    private int soLuongKhachHangNN;
    public QuanLyKH(){

    }
    public QuanLyKH(KhachHangVN[] khachHangVNS, KhachHangNN[] khachHangNNS, int soLuongKhachHangVN, int soLuongKhachHangNN) {
        this.khachHangVNS = khachHangVNS;
        this.khachHangNNS = khachHangNNS;
        this.soLuongKhachHangVN = soLuongKhachHangVN;
        this.soLuongKhachHangNN = soLuongKhachHangNN;
    }
    public QuanLyKH(int soLuongKhachHangNN,int soLuongKhachHangVN){
        this.soLuongKhachHangNN=soLuongKhachHangNN;
        this.soLuongKhachHangVN=soLuongKhachHangVN;
        this.khachHangNNS= new KhachHangNN[this.soLuongKhachHangNN];
        this.khachHangVNS= new KhachHangVN[this.soLuongKhachHangVN];
    }

    public void nhapDSKhachHangVN(){
        for (int i = 0; i <this.soLuongKhachHangVN ; i++) {
            this.khachHangVNS[i]= new KhachHangVN();
            this.khachHangVNS[i].nhap();
        }
    }
    public void xuatDSKhachHangVN(){
        for (int i = 0; i <this.soLuongKhachHangVN ; i++) {
            this.khachHangVNS[i].toString();
        }
    }
    public void nhapDSKhachHangNN(){
        for (int i = 0; i <this.soLuongKhachHangNN ; i++) {
            this.khachHangNNS[i]= new KhachHangNN();
            this.khachHangNNS[i].nhap();
        }
    }
    public void xuatDSKhachHangNN(){
        for (int i = 0; i <this.soLuongKhachHangNN ; i++) {
            this.khachHangNNS[i].toString();
        }
    }
    public int tongSoLuongVN(){
        int tong=0;
        for (int i = 0; i <this.soLuongKhachHangVN ; i++) {
            tong+=this.khachHangVNS[i].getSoLuong();
        }
        return tong;
    }
    public int tongSoLuongNN(){
        int tong2=0;
        for (int i = 0; i <this.soLuongKhachHangNN ; i++) {
            tong2+=this.khachHangNNS[i].getSoLuong();
        }
        return tong2;
    }
    public double tongThanhTienNN(){
        double tong3=0;
        for (int i = 0; i <this.soLuongKhachHangNN ; i++) {
            tong3+=this.khachHangNNS[i].tinhThanhTienNN();
        }
        return tong3;
    }
    public double tbThanhTienNN(){
        return tongThanhTienNN()/this.soLuongKhachHangNN;
    }
}
