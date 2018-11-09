package com.thanhtuan.bai3.bai3;

public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich(2,1);
        quanLyGiaoDich.nhapDanhSachGiaoDichTienTe();
        quanLyGiaoDich.xuatDanhSachGiaoDichTienTe();
        //System.out.println(quanLyGiaoDich.tinhTongSoLuongTienTeTT());
        System.out.println(quanLyGiaoDich.tinhTrungBinhThanhTienTT());
        quanLyGiaoDich.xuatRaGiaoDichCoDonGiaHon1Ty();
    }
}
