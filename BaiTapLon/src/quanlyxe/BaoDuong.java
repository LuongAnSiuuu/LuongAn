package quanlyxe;

public class BaoDuong {
    private String bienSo;
    private String ngay;
    private String noiDung;
    private double chiPhi;

    public BaoDuong(String bienSo, String ngay, String noiDung, double chiPhi) {
        this.bienSo = bienSo;
        this.ngay = ngay;
        this.noiDung = noiDung;
        this.chiPhi = chiPhi;
    }

    public String getBienSo() { return bienSo; }
    public String getNgay() { return ngay; }
    public String getNoiDung() { return noiDung; }
    public double getChiPhi() { return chiPhi; }
}
    