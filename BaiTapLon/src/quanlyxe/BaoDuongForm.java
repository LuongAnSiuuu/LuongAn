package quanlyxe;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class BaoDuongForm extends JFrame {
    private DefaultTableModel model;
    private ArrayList<BaoDuong> danhSach = new ArrayList<>();

    public BaoDuongForm(ArrayList<Xe> danhSachXe) {
        setTitle("QUẢN LÝ BẢO DƯỠNG");
        setSize(750, 450);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

  
        model = new DefaultTableModel(new String[]{"Biển số", "Ngày", "Nội dung", "Chi phí"}, 0);
        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);


        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createTitledBorder("Thêm thông tin bảo dưỡng"));

        JComboBox<String> cbBienSo = new JComboBox<>();
        for (Xe xe : danhSachXe) {
            cbBienSo.addItem(xe.getBienSo());
        }

        JTextField txtNgay = new JTextField();
        JTextField txtNoiDung = new JTextField();
        JTextField txtChiPhi = new JTextField();
        JButton btnThem = new JButton("Thêm bảo dưỡng");

     
        form.add(new JLabel("Biển số xe:")); form.add(cbBienSo);
        form.add(new JLabel("Ngày bảo dưỡng:")); form.add(txtNgay);
        form.add(new JLabel("Nội dung:")); form.add(txtNoiDung);
        form.add(new JLabel("Chi phí:")); form.add(txtChiPhi);
        form.add(new JLabel("")); form.add(btnThem);

 
        JPanel bottomPanel = new JPanel();
        JButton btnQuayLai = new JButton("Quay lại");
        bottomPanel.add(btnQuayLai);

     
        btnThem.addActionListener(e -> {
            String bienSo = (String) cbBienSo.getSelectedItem();
            String ngay = txtNgay.getText().trim();
            String noiDung = txtNoiDung.getText().trim();
            String chiPhiStr = txtChiPhi.getText().trim();

            if (ngay.isEmpty() || noiDung.isEmpty() || chiPhiStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double chiPhi;
            try {
                chiPhi = Double.parseDouble(chiPhiStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Chi phí phải là số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            BaoDuong bd = new BaoDuong(bienSo, ngay, noiDung, chiPhi);
            danhSach.add(bd);
            model.addRow(new Object[]{bienSo, ngay, noiDung, chiPhi});

            txtNgay.setText("");
            txtNoiDung.setText("");
            txtChiPhi.setText("");
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
