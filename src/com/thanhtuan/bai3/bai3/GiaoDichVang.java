package com.thanhtuan.bai3.bai3;

import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang;
    private double thanhTien;

    public String getLoaiVang(){
        return loaiVang;
    }
    public void setLoaiVang(String loaiVang){
        this.loaiVang = loaiVang;
    }
    public GiaoDichVang(){
        super();
        this.loaiVang = "";
    }
    public GiaoDichVang(int maGiaoDich, double donGia, int soLuong,Ngay ngayGD, String loaiVang) {
        super(maGiaoDich, donGia, soLuong, ngayGD);
        this.loaiVang = loaiVang;
    }
    public void nhap(){
        super.nhap();
        System.out.println("nhap loai vang");
        this.loaiVang= new Scanner(System.in).nextLine();
        do {
            if(!loaiVang.equals("tay")&&!loaiVang.equals("ta")){
                System.out.println("nhap sai roi nhap lai di");
            }
        }while(loaiVang.equals("tay")&&loaiVang.equals("ta"));
        this.tinhThanhTien();

    }
    public double tinhThanhTien(){
        return getDonGia()* getSoLuong();
    }

   public void xuat(){
        super.xuat();
       System.out.println("loai vang"+this.loaiVang);
   }
}
