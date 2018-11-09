package com.thanhtuan.bai3.Bai5;

import java.util.Date;
import java.util.Scanner;

public class KhachHangVN extends KhachHang {
    private String doiTuongKH;
    private int dinhMuc;

    public KhachHangVN(){
        super();
    }

    public KhachHangVN(int maKH, String name, int soLuong, double donGia, Date ngayRaHD, double thanhTien, String doiTuongKH, int dinhMuc) {
        super(maKH, name, soLuong, donGia, ngayRaHD, thanhTien);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    public void nhap(){
        super.nhap();
        System.out.println("nhap dinh muc");
        this.dinhMuc= new Scanner(System.in).nextInt();
        do {
            System.out.println("nhap doi tuong khach hang");
            if(!doiTuongKH.equals("sinhhoat")&&!doiTuongKH.equals("kinhdoanh")&&!doiTuongKH.equals("sanxuat")){
                System.out.println("nhap sai roi nhap lai di");
            }
        }while (!doiTuongKH.equals("sinhhoat")&&!doiTuongKH.equals("kinhdoanh")&&!doiTuongKH.equals("sanxuat"));{
            this.doiTuongKH=doiTuongKH;
        }
    }
    public int KWVuot(){
        return getSoLuong()-getDinhMuc();
    }
    public double tinhThanhTienVN(){
        if(getSoLuong()<= getDinhMuc()){
            return getSoLuong() * getDonGia();
        }
        else{
            return getSoLuong() * getDonGia() * getDinhMuc() + KWVuot() * getDonGia()*2.5;
        }
    }

    @Override
    public String toString() {
        return "KhachHangVN{" + super.toString()+
                "doiTuongKH='" + doiTuongKH + '\'' +
                ", dinhMuc=" + dinhMuc +
                '}';
    }
}
