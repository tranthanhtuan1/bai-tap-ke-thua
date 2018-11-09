package com.thanhtuan.bai3.bai2;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private int tinhTrang;
    private double thanhTien;

    public int getTinhTrang() {
        return this.tinhTrang;
    }

    public double getThanhTien() {
        return this.thanhTien;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public SachGiaoKhoa() {

    }

    public SachGiaoKhoa(int maSach, int soLuong, double donGia, String nhaXuatBan, int tinhTrang, double thanhTien) {
        super(maSach, soLuong, donGia, nhaXuatBan);
        this.tinhTrang = tinhTrang;
        this.thanhTien = thanhTien;
    }

    public void nhap() {
        super.nhap();
        System.out.println("nhap tinh trang sach 1:cu 2:moi");
        this.tinhTrang = (new Scanner(System.in)).nextInt();
        do {
            if(tinhTrang!=1&&tinhTrang!=2){
                System.out.println("nhap sai roi nhap lai di");
            }
        }while (tinhTrang==1&&tinhTrang==2);
        this.thanhTienSach();
    }

    public double thanhTienSach() {
        if(tinhTrang==1){
            this.thanhTien= getDonGia() * getSoLuong();
        }
        else{
            this.thanhTien= 0.5 * getSoLuong() * getDonGia();
        }
        return thanhTien;
    }
    public void xuat(){
        super.xuat();
        System.out.println("tinh trang"+this.tinhTrang);
        System.out.println("thanh tien"+ this.thanhTien);

    }


}
