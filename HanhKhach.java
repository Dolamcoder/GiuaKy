package GiuaKy;

import java.util.ArrayList;
import java.util.List;
public class HanhKhach implements IHanhKhach {
    private String id;
    private String tenHanhKhach;
    private int namSinh;
    private String soHoChieu;
    private String idHangBay;
    private String maTheThanhVien;
    private double soDamBayTichLuy;
    private char hangTheThanhVien;
    private ArrayList<Ticket> danhSachVe;
    private String diaChi;

    public HanhKhach(String id, String tenHanhKhach, int namSinh, String soHoChieu, 
                     String idHangBay, String diaChi) {
        this.id = id;
        this.tenHanhKhach = tenHanhKhach;
        this.namSinh = namSinh;
        this.soHoChieu = soHoChieu;
        this.idHangBay = idHangBay;
        this.maTheThanhVien = "TV" + id;
        this.soDamBayTichLuy = 0.0;
        this.hangTheThanhVien = 'B'; // Basic by default
        this.danhSachVe = new ArrayList<>();
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public String getTenHanhKhach() {
        return tenHanhKhach;
    }

    public void setTenHanhKhach(String tenHanhKhach) {
        this.tenHanhKhach = tenHanhKhach;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public void setIdHangBay(String idHangBay) {
        this.idHangBay = idHangBay;
    }

    public void setMaTheThanhVien(String maTheThanhVien) {
        this.maTheThanhVien = maTheThanhVien;
    }

    public void setSoDamBayTichLuy(double soDamBayTichLuy) {
        this.soDamBayTichLuy = soDamBayTichLuy;
    }

    public void setHangTheThanhVien(char hangTheThanhVien) {
        this.hangTheThanhVien = hangTheThanhVien;
    }

    public void setDanhSachVe(ArrayList<Ticket> danhSachVe) {
        this.danhSachVe = danhSachVe;
    }

    @Override
    public void datVe(String maChuyenBay, char hangGhe) {
        int count=0;
        for(Ticket x:danhSachVe)
        {
            if(x.getTrangThai()=='B'){
                count++;
            }
        }
        if(count>5){
            System.out.println("So luong ve da dat gioi han");
        }
        else{
        String maVe = "V" + String.format("%05d", danhSachVe.size() + 1);
        Ticket veMoi = new Ticket(maVe, maChuyenBay, hangGhe, this);
        danhSachVe.add(veMoi);
        System.out.println("Đặt vé thành công: " + veMoi);
        }
    }

    @Override
    public double huyVe(String maVe) {
         for(Ticket x:danhSachVe){
             if(x.getMaVe()==maVe){
                 danhSachVe.remove(x);
                 return x.getGiaVe();
                
             }
         }
       return 0;
    }

    @Override
    public void doiVe(String maVeCu, String maChuyenBayMoi, String maVemoi) {
        for (Ticket ve : danhSachVe) {
           if(ve.getMaVe()==maVeCu){
               ve.setMaVe(maVemoi);
               ve.setMaChuyenBay(maChuyenBayMoi);
               break;
            }
        }
        System.out.println("Không tìm thấy vé với mã: " + maVeCu);
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public String getIdHangBay() {
        return idHangBay;
    }

    public String getMaTheThanhVien() {
        return maTheThanhVien;
    }

    public double getSoDamBayTichLuy() {
        return soDamBayTichLuy;
    }

    public char getHangTheThanhVien() {
        return hangTheThanhVien;
    }

    public List<Ticket> getDanhSachVe() {
        return danhSachVe;
    }

    @Override
    public char kiemTraTrangThaiVe(String maVe) {
        for (Ticket ve : danhSachVe) {
            if(ve.getMaVe()==maVe){
                return ve.getTrangThai();
            }
        }
        return ' ';
    }

    @Override
    public void tichLuyDamBay(double damBay) {
        soDamBayTichLuy += damBay;
        if (soDamBayTichLuy >= 50000) {
            hangTheThanhVien = 'G';
        } else if (soDamBayTichLuy >= 10000) {
            hangTheThanhVien = 'S';
        }
        else hangTheThanhVien='B';
    }
    public void danhSachve()
    {
        for(Ticket ve:danhSachVe){
            System.out.println(ve);
        }
    }
        
    @Override
    public String toString() {
        return "HanhKhach{" +
                "id='" + id + '\'' +
                ", tenHanhKhach='" + tenHanhKhach + '\'' +
                ", namSinh=" + namSinh +
                ", diaChi='" + diaChi + '\'' +
                ", soDamBayTichLuy=" + soDamBayTichLuy +
                ", hangTheThanhVien=" + hangTheThanhVien +
                '}';
    }
}
