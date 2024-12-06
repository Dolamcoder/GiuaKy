package GiuaKy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private String maVe;
    private String maChuyenBay;
    private char hangGhe;
    private double giaVe;
    private char trangThai;
    private HanhKhach hanhKhach;
    private String ngayDatVe;

    public Ticket(String maVe, String maChuyenBay, char hangGhe, HanhKhach hanhKhach) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.hangGhe = hangGhe;
        this.trangThai = 'B'; // Booked by default
        this.hanhKhach = hanhKhach;
        this.giaVe = tinhGiaVe(hangGhe);
        this.ngayDatVe = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public char getTrangThai() {
        return trangThai;
    }

    private double tinhGiaVe(char hangGhe) {
        switch (hangGhe) {
            case 'B': return 2000.0;
            case 'F': return 5000.0;
            default: return 1000.0; // Economy
        }
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public void setHangGhe(char hangGhe) {
        this.hangGhe = hangGhe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public void setTrangThai(char trangThai) {
        this.trangThai = trangThai;
    }

    public void setHanhKhach(HanhKhach hanhKhach) {
        this.hanhKhach = hanhKhach;
    }

    public void setNgayDatVe(String ngayDatVe) {
        this.ngayDatVe = ngayDatVe;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public char getHangGhe() {
        return hangGhe;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public HanhKhach getHanhKhach() {
        return hanhKhach;
    }

    public String getNgayDatVe() {
        return ngayDatVe;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "maVe='" + maVe + '\'' +
                ", maChuyenBay='" + maChuyenBay + '\'' +
                ", hangGhe=" + hangGhe +
                ", giaVe=" + giaVe +
                ", trangThai=" + trangThai +
                ", ngayDatVe='" + ngayDatVe + '\'' +
                '}';
    }
}
