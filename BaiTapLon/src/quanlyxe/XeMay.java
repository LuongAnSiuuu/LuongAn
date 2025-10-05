package quanlyxe;

public class XeMay extends Xe {
    private String loaiXe;

    public XeMay(String bienSo, String hangXe, String mauSac, int soLuong, int dungTich, double giaTien, String loaiXe) {
        super(bienSo, hangXe, mauSac, soLuong, dungTich, giaTien);
        this.loaiXe = loaiXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }
}
