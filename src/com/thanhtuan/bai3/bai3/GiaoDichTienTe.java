package com.thanhtuan.bai3.bai3;

import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {
    private int tiGia;
    private String loaiTien;
    private double thanhTien;

    public GiaoDichTienTe() {
       super();
    }

    public GiaoDichTienTe(int maGiaoDich, double donGia, int soLuong, Ngay ngayGD, int tiGia, String loaiTien,double thanhTien) {
        super(maGiaoDich, donGia, soLuong, ngayGD);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
        this.thanhTien = thanhTien;
    }

    public GiaoDichTienTe(int tiGia, String loaiTien) {
        super();
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public int getTiGia() {
        return tiGia;
    }
    public void setTiGia(int tiGia) {
        this.tiGia = tiGia;
    }
    public String getLoaiTien() {
        return loaiTien;
    }
    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public void nhap(){
        super.nhap();
        System.out.println("nhap ti gia");
        this.tiGia = new Scanner(System.in).nextInt();
        System.out.println("nhap cac loai tien te(USD hoac Euro hoac VN)");
        this.loaiTien = new Scanner(System.in).nextLine();
        do {
            if (!loaiTien.equals("USD") && !loaiTien.equals("Euro") && !loaiTien.equals("VN")) {
                System.out.println("nhap sai nhap lai di");
            }
        }while (loaiTien.equals("USD") && loaiTien.equals("Euro") && loaiTien.equals("VN")) ;
        this.thanhTienTe();
    }
    public double thanhTienTe(){
        if(this.loaiTien.equals("VN")){
            this.thanhTien=getSoLuong()*getDonGia();
        }
        else{
            this.thanhTien= getSoLuong()*getDonGia()*getTiGia();
        }
        return thanhTien;
    }
    public void xuat(){
        super.xuat();
        System.out.println("ti gia"+ this.tiGia);
        System.out.println("loai tien"+ this.loaiTien);
    }


}
