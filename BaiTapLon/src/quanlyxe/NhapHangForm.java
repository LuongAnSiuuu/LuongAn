package quanlyxe;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class NhapHangForm extends JFrame {
    private DefaultTableModel model;
    private ArrayList<NhapHang> danhSachNhap = new ArrayList<>();

    public NhapHangForm(ArrayList<Xe> danhSachXe) {
        setTitle("QUẢN LÝ NHẬP HÀNG");
        setSize(750, 450);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(230, 240, 255));

  
        model = new DefaultTableModel(new String[]{"Biển số", "Ngày nhập", "Số lượng", "Giá nhập"}, 0);
        JTable table = new JTable(model);
        table.setBackground(new Color(245, 255, 250));
        table.setGridColor(Color.LIGHT_GRAY);
        JScrollPane scroll = new JScrollPane(table);

        // ====== FORM NHẬP ======
        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createTitledBorder("Thêm thông tin nhập hàng"));
        form.setBackground(new Color(255, 250, 240));

        JComboBox<String> cbBienSo = new JComboBox<>();
        for (Xe xe : danhSachXe) {
            cbBienSo.addItem(xe.getBienSo());
        }

        JTextField txtNgay = new JTextField();
        JTextField txtSoLuong = new JTextField();
        JTextField txtGiaNhap = new JTextField();

        JButton btnThem = new JButton("Thêm nhập hàng");
        JButton btnQuayLai = new JButton("Quay lại");
        

        btnThem.setBackground(new Color(60, 179, 113)); 
        btnThem.setForeground(Color.WHITE);
        btnQuayLai.setBackground(new Color(220, 20, 60)); 
        btnQuayLai.setForeground(Color.WHITE);

        form.add(new JLabel("Biển số xe:")); form.add(cbBienSo);
        form.add(new JLabel("Ngày nhập:")); form.add(txtNgay);
        form.add(new JLabel("Số lượng:")); form.add(txtSoLuong);
        form.add(new JLabel("Giá nhập:")); form.add(txtGiaNhap);
        form.add(new JLabel("")); form.add(btnThem);

  
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(240, 240, 240));
        bottomPanel.add(btnQuayLai);

       
        btnThem.addActionListener(e -> {
            String bienSo = (String) cbBienSo.getSelectedItem();
            String ngay = txtNgay.getText().trim();
            String soLuongStr = txtSoLuong.getText().trim();
            String giaStr = txtGiaNhap.getText().trim();

            if (ngay.isEmpty() || soLuongStr.isEmpty() || giaStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int soLuong;
            double giaNhap;
            try {
                soLuong = Integer.parseInt(soLuongStr);
                giaNhap = Double.parseDouble(giaStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Số lượng hoặc giá nhập không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            NhapHang nh = new NhapHang(bienSo, ngay, soLuong, giaNhap);
            danhSachNhap.add(nh);
            model.addRow(new Object[]{bienSo, ngay, soLuong, giaNhap});

            txtNgay.setText("");
            txtSoLuong.setText("");
            txtGiaNhap.setText("");
        });

      
        btnQuayLai.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(this,
                    "Bạn có chắc muốn quay lại không?",
                    "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                dispose();
            }
        });

       
        add(form, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}
