package com.thanhtuan.bai3.bai3;

public class QuanLyGiaoDich {
    private GiaoDichVang[] giaoDichVangs;
    private GiaoDichTienTe[] giaoDichTienTes;
    private int soLuongGiaoDichVang;
    private int soLuongGiaoDichTienTe;

    public QuanLyGiaoDich(){

    }

    public QuanLyGiaoDich(GiaoDichVang[] giaoDichVangs, GiaoDichTienTe[] giaoDichTienTes, int soLuongGiaoDichVang, int soLuongGiaoDichTienTe) {
        this.giaoDichVangs = giaoDichVangs;
        this.giaoDichTienTes = giaoDichTienTes;
        this.soLuongGiaoDichVang = soLuongGiaoDichVang;
        this.soLuongGiaoDichTienTe = soLuongGiaoDichTienTe;
    }

    public QuanLyGiaoDich(int soLuongGiaoDichVang, int soLuongGiaoDichTienTe) {
        this.soLuongGiaoDichVang = soLuongGiaoDichVang;
        this.soLuongGiaoDichTienTe = soLuongGiaoDichTienTe;
        this.giaoDichVangs = new GiaoDichVang[this.soLuongGiaoDichVang];
        this.giaoDichTienTes = new GiaoDichTienTe[this.soLuongGiaoDichTienTe];
    }
    public void nhapDanhSachGiaoDichVang(){
        for (int i = 0; i <this.soLuongGiaoDichVang ; i++) {
            this.giaoDichVangs[i] = new GiaoDichVang();
            this.giaoDichVangs[i].nhap();
        }
    }
    public void xuatDanhSachGiaoDichVang(){
        for (int i = 0; i <this.soLuongGiaoDichVang ; i++) {
            this.giaoDichVangs[i].xuat();
        }
    }
    public void nhapDanhSachGiaoDichTienTe(){
        for (int i = 0; i <this.soLuongGiaoDichTienTe ; i++) {
            this.giaoDichTienTes[i] = new GiaoDichTienTe();
            this.giaoDichTienTes[i].nhap();
        }
    }
    public void xuatDanhSachGiaoDichTienTe(){
        for (int i = 0; i <this.soLuongGiaoDichTienTe ; i++) {
            this.giaoDichTienTes[i].xuat();
        }
    }

    public int tinhTongSoLuongVang(){
        int tong=0;
        for (int i = 0; i <this.soLuongGiaoDichVang ; i++) {
            tong+= this.giaoDichVangs[i].getSoLuong();
        }
        return tong;
    }
    public int tinhTongSoLuongTienTe(){
        int tong2=0;
        for (int i = 0; i <this.soLuongGiaoDichTienTe ; i++) {
            tong2+=this.giaoDichTienTes[i].getSoLuong();
        }
        return tong2;
    }
    public double tinhTongThanhTienTT(){
        double tong3=0;
        for (int i = 0; i <this.soLuongGiaoDichTienTe ; i++) {
            tong3+=this.giaoDichTienTes[i].thanhTienTe();
        }
        return tong3;
    }
    public double tinhTrungBinhThanhTienTT(){
        return tinhTongThanhTienTT()/this.soLuongGiaoDichTienTe;

    }
    public void xuatRaGiaoDichCoDonGiaHon1Ty(){
        for (int i = 0; i <this.soLuongGiaoDichTienTe ; i++) {
            if(this.giaoDichTienTes[i].getDonGia()>1000000000){
                System.out.println("giao dich co don gia hon 1 ty la"+this.giaoDichTienTes[i].getDonGia());
            }
        }
    }
}
