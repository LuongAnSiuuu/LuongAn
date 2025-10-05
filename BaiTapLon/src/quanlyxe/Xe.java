package quanlyxe;

public abstract class Xe {
    protected String bienSo;
    protected String hangXe;
    protected String mauSac;
    protected int soLuong;
    protected int dungTich;
    protected double giaTien;

    public Xe(String bienSo, String hangXe, String mauSac, int soLuong, int dungTich, double giaTien) {
        this.bienSo = bienSo;
        this.hangXe = hangXe;
        this.mauSac = mauSac;
        this.soLuong = soLuong;
        this.dungTich = dungTich;
        this.giaTien = giaTien;
    }

    public String getBienSo() { return bienSo; }
    public String getHangXe() { return hangXe; }
    public String getMauSac() { return mauSac; }
    public int getSoLuong() { return soLuong; }
    public int getDungTich() { return dungTich; }
    public double getGiaTien() { return giaTien; }

    public double tongTien() {
        return soLuong * giaTien;
    }
}
