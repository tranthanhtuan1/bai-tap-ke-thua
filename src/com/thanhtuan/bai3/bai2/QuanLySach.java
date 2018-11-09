package com.thanhtuan.bai3.bai2;

public class QuanLySach {
    private SachGiaoKhoa[] sachGiaoKhoas;
    private SachThamKhao[] sachThamKhaos;
    private int soLuongSachGiaoKhoa;
    private int soLuongSachThamKhao;

    public QuanLySach(int soLuongSachGiaoKhoa, int soLuongSachThamKhao) {
        this.soLuongSachGiaoKhoa = soLuongSachGiaoKhoa;
        this.soLuongSachThamKhao = soLuongSachThamKhao;
        this.sachGiaoKhoas = new SachGiaoKhoa[this.soLuongSachGiaoKhoa];
        this.sachThamKhaos = new SachThamKhao[this.soLuongSachThamKhao];
    }

    public void nhapSachGiaoKhoa() {
        for(int i = 0; i < this.soLuongSachGiaoKhoa; ++i) {
            this.sachGiaoKhoas[i] = new SachGiaoKhoa();
            this.sachGiaoKhoas[i].nhap();
        }

    }

    public void xuatSachGiaoKhoa() {
        for(int i = 0; i < this.soLuongSachGiaoKhoa; ++i) {
            this.sachGiaoKhoas[i].xuat();
        }

    }

    public void nhapSachThamKhao() {
        for(int i = 0; i < this.soLuongSachThamKhao; ++i) {
            this.sachThamKhaos[i] = new SachThamKhao();
            this.sachThamKhaos[i].nhap();
        }

    }

    public void xuatSachThamKhao() {
        for(int i = 0; i < this.soLuongSachThamKhao; ++i) {
            this.sachThamKhaos[i].xuat();
        }

    }
    public double tongTTSGK(){
        double tong=0;
        for (int i = 0; i <this.soLuongSachGiaoKhoa ; i++) {
            tong+=this.sachGiaoKhoas[i].getThanhTien();
        }
        return tong;
    }
//    public double tBCDGcuaSTK(){
//       double tB;
//        for (int i = 0; i <this.soLuongSachThamKhao ; i++) {
//            tB=this.sachThamKhaos[i].getDonGia()/this.soLuongSachThamKhao;
//        }
//        return tB;
//    }

}
