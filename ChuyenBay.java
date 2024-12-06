package GiuaKy;

import java.util.ArrayList;
import java.util.List;

public class ChuyenBay {
    private String maChuyenBay;
    private String sanBayDi;
    private String sanBayDen;
    private String ngayBay;
    private String gioBay;
    private int soGheEconomy;
    private int soGheBusiness;
    private int soGheFirst;
    private ArrayList<Ghe> danhSachGhe;
    private char trangThai;
    private ArrayList<Ticket> danhSachVe;
    private double khoangCachBay;

    public ChuyenBay(String maChuyenBay, String sanBayDi, String sanBayDen, String ngayBay, 
                     String gioBay, double khoangCachBay) {
        this.maChuyenBay = maChuyenBay;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.khoangCachBay = khoangCachBay;
        this.soGheEconomy = 120;  // 20 dãy × 6 ghế
        this.soGheBusiness = 40; // 10 dãy × 4 ghế
        this.soGheFirst = 10;    // 5 dãy × 2 ghế
        this.trangThai = 'S';    // Scheduled
        this.danhSachVe = new ArrayList<>();
        this.danhSachGhe = khoiTaoDanhSachGhe();
    }

    private ArrayList<Ghe> khoiTaoDanhSachGhe() {
        ArrayList<Ghe> danhSach = new ArrayList<>();
        for (int i = 1; i <= 20; i++) { // Economy
            for (char c = 'A'; c <= 'F'; c++) {
                danhSach.add(new Ghe("Y" + i + c, 'Y', 500.0));
            }
        }
        for (int i = 1; i <= 10; i++) { // Business
            for (char c = 'A'; c <= 'D'; c++) {
                danhSach.add(new Ghe("B" + i + c, 'B', 1500.0));
            }
        }
        for (int i = 1; i <= 5; i++) { // First
            for (char c = 'A'; c <= 'B'; c++) {
                danhSach.add(new Ghe("F" + i + c, 'F', 3000.0));
            }
        }
        return danhSach;
    }

    public ArrayList<Ghe> kiemTraGheTrong(char hangGhe) {
        ArrayList<Ghe> gheTrong = new ArrayList<>();
        for (Ghe ghe : danhSachGhe) {
            if (ghe.getHanhGhe() == hangGhe && !ghe.isTrangThai()) {
                gheTrong.add(ghe);
            }
        }
        return gheTrong;
    }

    public boolean datGhe(String maGhe) {
        for (Ghe ghe : danhSachGhe) {
            if (ghe.getMaGhe().equals(maGhe) && !ghe.isTrangThai()) {
                ghe.setTrangThai(true);
                return true;
            }
        }
        return false;
    }

    public boolean huyGhe(String maGhe) {
        for (Ghe ghe : danhSachGhe) {
            if (ghe.getMaGhe()==maGhe) {
                ghe.setTrangThai(false);
                return true;
            }
        }
        return false;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setSanBayDi(String sanBayDi) {
        this.sanBayDi = sanBayDi;
    }

    public void setSanBayDen(String sanBayDen) {
        this.sanBayDen = sanBayDen;
    }

    public void setNgayBay(String ngayBay) {
        this.ngayBay = ngayBay;
    }

    public void setGioBay(String gioBay) {
        this.gioBay = gioBay;
    }

    public void setSoGheEconomy(int soGheEconomy) {
        this.soGheEconomy = soGheEconomy;
    }

    public void setSoGheBusiness(int soGheBusiness) {
        this.soGheBusiness = soGheBusiness;
    }

    public void setSoGheFirst(int soGheFirst) {
        this.soGheFirst = soGheFirst;
    }


    public void setTrangThai(char trangThai) {
        this.trangThai = trangThai;
    }

    public void setKhoangCachBay(double khoangCachBay) {
        this.khoangCachBay = khoangCachBay;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getSanBayDi() {
        return sanBayDi;
    }

    public String getSanBayDen() {
        return sanBayDen;
    }

    public String getNgayBay() {
        return ngayBay;
    }

    public String getGioBay() {
        return gioBay;
    }

    public int getSoGheEconomy() {
        return soGheEconomy;
    }

    public int getSoGheBusiness() {
        return soGheBusiness;
    }

    public int getSoGheFirst() {
        return soGheFirst;
    }
    public char getTrangThai() {
        return trangThai;
    }

    public double getKhoangCachBay() {
        return khoangCachBay;
    }
    public void danhSachGhe()
    {
        for(Ghe ghe:danhSachGhe)
        System.out.println(ghe);
    }
    public void danhSachVe()
    {
        for(Ticket ve: danhSachVe){
            System.out.println(ve);
        }
    }
    @Override
    public String toString() {
        return "ChuyenBay{" +
                "maChuyenBay='" + maChuyenBay + '\'' +
                ", sanBayDi='" + sanBayDi + '\'' +
                ", sanBayDen='" + sanBayDen + '\'' +
                ", ngayBay='" + ngayBay + '\'' +
                ", gioBay='" + gioBay + '\'' +
                ", trangThai=" + trangThai +
                ", khoangCachBay=" + khoangCachBay +
                '}';
    }
}
