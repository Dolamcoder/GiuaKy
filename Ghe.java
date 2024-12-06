package GiuaKy;

public class Ghe {
    private String maGhe;
    private char hanhGhe;
    private boolean trangThai; // true: đã đặt, false: trống
    private double giaCoBan;

    public Ghe(String maGhe, char hanhGhe, double giaCoBan) {
        this.maGhe = maGhe;
        this.hanhGhe = hanhGhe;
        this.giaCoBan = giaCoBan;
        this.trangThai = false; // Trống mặc định
    }

    public String getMaGhe() {
        return maGhe;
    }

    public char getHanhGhe() {
        return hanhGhe;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    @Override
    public String toString() {
        return "Ghe{" +
                "maGhe='" + maGhe + '\'' +
                ", hanhGhe=" + hanhGhe +
                ", trangThai=" + (trangThai ? "Đã đặt" : "Trống") +
                ", giaCoBan=" + giaCoBan +
                '}';
    }
}

