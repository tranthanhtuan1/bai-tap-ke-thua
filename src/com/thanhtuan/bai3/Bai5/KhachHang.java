package com.thanhtuan.bai3.Bai5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {
    private int maKH;
    private String name;
    private int soLuong;
    private double donGia;
    private Date ngayRaHD;
    private double thanhTien;

    public KhachHang(){

    }

    public KhachHang(int maKH, String name, int soLuong, double donGia, Date ngayRaHD,double thanhTien) {
        this.maKH = maKH;
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayRaHD = ngayRaHD;
        this.thanhTien=thanhTien;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgayRaHD() {
        return ngayRaHD;
    }

    public void setNgayRaHD(Date ngayRaHD) {
        this.ngayRaHD = ngayRaHD;
    }

    public double getThanhTien(){
        return thanhTien;
    }

    public void setThanhTien(){
        this.thanhTien=thanhTien;
    }

    public void nhap(){

        System.out.println("nhap ma khach hang");
        this.maKH= new Scanner(System.in).nextInt();
        System.out.println("nhap ho te khach hang");
        this.name= new Scanner(System.in).nextLine();
        System.out.println("nhap so luong dien tieu thu");
        this.soLuong= new Scanner(System.in).nextInt();
        System.out.println("nhap don gia");
        this.donGia= new Scanner(System.in).nextDouble();
        String ngay= new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try{
            this.ngayRaHD= df.parse(ngay);
        } catch (ParseException e){
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH=" + maKH +
                ", Name='" + name + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", ngayRaHD=" + ngayRaHD +
                '}';
    }
}
