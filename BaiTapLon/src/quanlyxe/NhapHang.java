package quanlyxe;

public class NhapHang {
    private String bienSo;
    private String ngayNhap;
    private int soLuong;
    private double giaNhap;

    public NhapHang(String bienSo, String ngayNhap, int soLuong, double giaNhap) {
        this.bienSo = bienSo;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
    }

    public String getBienSo() { return bienSo; }
    public String getNgayNhap() { return ngayNhap; }
    public int getSoLuong() { return soLuong; }
    public double getGiaNhap() { return giaNhap; }
}
