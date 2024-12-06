package GiuaKy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class HangBay {
    private String id;
    private String tenHangBay;
    private List<ChuyenBay> danhSachChuyenBay;
    private List<HanhKhach> danhSachHanhKhach;
    private double[] bangGiaCoBan;

    public HangBay(String id, String tenHangBay, double[] bangGiaCoBan) {
        this.id = id;
        this.tenHangBay = tenHangBay;
        this.danhSachChuyenBay = new ArrayList<>();
        this.danhSachHanhKhach = new ArrayList<>();
        this.bangGiaCoBan = bangGiaCoBan;
    }

    public void themChuyenBay(ChuyenBay chuyenBay) {
        danhSachChuyenBay.add(chuyenBay);
    }

    public void xoaChuyenBay(String maChuyenBay) {
        for(ChuyenBay bay:danhSachChuyenBay){
            if(bay.getMaChuyenBay()==maChuyenBay){
               danhSachChuyenBay.remove(bay);
            }
    }
    }

    public ChuyenBay timChuyenBay(String maChuyenBay){
        for (ChuyenBay cb : danhSachChuyenBay) {
            if(cb.getMaChuyenBay()==maChuyenBay) {
                return cb;
            }
        }
        return null;
    }
    public void themHanhKhach(HanhKhach hanhKhach) {
        danhSachHanhKhach.add(hanhKhach);
    }

    public void xoaHanhKhach(String idHanhKhach) {
        for(HanhKhach x:danhSachHanhKhach)
        {
            if(x.getId()==idHanhKhach){
                danhSachHanhKhach.remove(x);
                break;
            }
        }
           System.out.println("xoa thanh cong");  
    }

    public HanhKhach timHanhKhach(String idHanhKhach) {
        for (HanhKhach hk : danhSachHanhKhach) {
            if (hk.getId().equals(idHanhKhach)) {
                return hk;
            }
        }
        return null;
    }

    public double tinhTongDoanhThu() {
        double doanhThu = 0.0;
        for (ChuyenBay cb : danhSachChuyenBay) {
            for (Ghe ghe : cb.kiemTraGheTrong('Y')) { // Lấy danh sách ghế đặt
                doanhThu += ghe.getGiaCoBan();
            }
        }
        return doanhThu;
    }
        public void danhSachChuyenBay(){
            for(ChuyenBay x: danhSachChuyenBay)
            {
                System.out.println(x);
            }
        }
        public void danhSachKhachXapxepTheoTen()
        { 
            Collections.sort(danhSachHanhKhach, new Comparator<HanhKhach>(){
                @Override
                public int compare(HanhKhach o1, HanhKhach o2) {
                    return o1.getTenHanhKhach().compareTo(o2.getTenHanhKhach());
                }
                
            });
            for(HanhKhach x: danhSachHanhKhach)
            {
                System.out.println(x);
            }
        }
        public void danhSachtheoDambay()
        {
            Collections.sort(danhSachHanhKhach, new Comparator<HanhKhach>(){
                @Override
                public int compare(HanhKhach o1, HanhKhach o2) {
                        return (int) (o2.getSoDamBayTichLuy()-o1.getSoDamBayTichLuy());
                }
            });
            for(HanhKhach x: danhSachHanhKhach){
                System.out.println(x);
            }
        }
    @Override
    public String toString() {
        return "HangBay{" +
                "id='" + id + '\'' +
                ", tenHangBay='" + tenHangBay + '\'' +
                ", soChuyenBay=" + danhSachChuyenBay.size() +
                ", soHanhKhach=" + danhSachHanhKhach.size() +
                '}';
    }
}

