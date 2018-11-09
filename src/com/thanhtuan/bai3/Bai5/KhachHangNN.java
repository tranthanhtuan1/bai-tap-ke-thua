package com.thanhtuan.bai3.Bai5;

import java.util.Date;
import java.util.Scanner;

public class KhachHangNN extends KhachHang {
    private String qT;

    public KhachHangNN(){
        super();
    }

    public KhachHangNN(int maKH, String name, int soLuong, double donGia, Date ngayRaHD, double thanhTien, String qT) {
        super(maKH, name, soLuong, donGia, ngayRaHD, thanhTien);
        this.qT = qT;
    }

    public String getqT() {
        return qT;
    }

    public void setqT(String qT) {
        this.qT = qT;
    }

    public void nhap(){
        super.nhap();
        System.out.println("nhap quoc tich cua khach hang");
        this.qT= new Scanner(System.in).nextLine();
    }
    public double tinhThanhTienNN(){
        return getSoLuong() * getDonGia();
    }

    @Override
    public String toString() {
        return "KhachHangNN{" + super.toString()+
                "qT='" + qT + '\'' +
                '}';
    }
}
