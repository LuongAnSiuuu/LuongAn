package quanlyxe;
import javax.swing.*;
import java.util.ArrayList;
import quanlyxe.BaoDuongForm;


public class QuanLyXe extends javax.swing.JFrame {
    private ArrayList<Xe> danhSachXe = new ArrayList<>();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(QuanLyXe.class.getName());


    public QuanLyXe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        txtMauSac = new javax.swing.JTextField();
        txtBienSo = new javax.swing.JTextField();
        txtHangXe = new javax.swing.JTextField();
        txtDungTich = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbLoaiXe = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTuKhoa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblXe = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Hãng Xe:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Số Lượng:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Biển Số:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Màu Sắc:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Dung Tích(cc):");

        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        txtMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMauSacActionPerformed(evt);
            }
        });

        txtBienSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBienSoActionPerformed(evt);
            }
        });

        txtHangXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHangXeActionPerformed(evt);
            }
        });

        txtDungTich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDungTichActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Loại Xe:");

        cbLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xe gắn máy", "Xe số", "Xe tay ga", "Xe côn tay", "Xe điện" }));
        cbLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiXeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Giá Tiền:");

        txtGiaTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaTienActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setText("Quản Lý Xe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49))
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDungTich, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(txtMauSac, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(txtBienSo, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(txtHangXe, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(txtGiaTien)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cbLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(252, 252, 252))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHangXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtDungTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Màu Sắc:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed1(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Tìm Kiếm Xe");

        txtTuKhoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTuKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuKhoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Từ khóa:");

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tblXe.setBackground(new java.awt.Color(0, 204, 255));
        tblXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Biển Số ", "Hãng Xe", "Màu Sắc", "Số Lượng", "Dung Tích", "Loại Xe", "Giá Tiền", "Tổng Tiền"
            }
        ));
        jScrollPane1.setViewportView(tblXe);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jButton1.setText("Bảo Dưỡng Xe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Nhập Hàng");
        jButton3.setToolTipText("");
        jButton3.setActionCommand("Nhập Hàng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnThem)
                .addGap(77, 77, 77)
                .addComponent(btnXoa)
                .addGap(125, 125, 125)
                .addComponent(jButton1)
                .addGap(85, 85, 85)
                .addComponent(jButton3)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(387, 387, 387)
                    .addComponent(jLabel5)
                    .addContainerGap(388, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addComponent(jLabel5)
                    .addContainerGap(759, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         String keyword = txtTuKhoa.getText().toLowerCase();
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblXe.getModel();

    for (int i = 0; i < model.getRowCount(); i++) {
        String bienSo = model.getValueAt(i, 0).toString().toLowerCase();
        String hangXe = model.getValueAt(i, 1).toString().toLowerCase();

        if (bienSo.contains(keyword) || hangXe.contains(keyword)) {
            tblXe.setRowSelectionInterval(i, i); 
            return;
        }
    }
    javax.swing.JOptionPane.showMessageDialog(this, "Không tìm thấy xe phù hợp!");

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tblXe.getSelectedRow();
    if (row != -1) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblXe.getModel();
        model.removeRow(row);
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng để xóa!");
    }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed1
       try {
        String bienSo = txtBienSo.getText();
        String hangXe = txtHangXe.getText();
        String mauSac = txtMauSac.getText();
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        int dungTich = Integer.parseInt(txtDungTich.getText());
        double giaTien = Double.parseDouble(txtGiaTien.getText());
        String loaiXe = cbLoaiXe.getSelectedItem().toString();

        Xe xe;

        switch (loaiXe) {
            case "Xe điện":
                xe = new XeDien(bienSo, hangXe, mauSac, soLuong, dungTich, giaTien);
                break;
            case "Xe tay ga":
                xe = new XeGa(bienSo, hangXe, mauSac, soLuong, dungTich, giaTien);
                break;
            default: // các loại xe khác
                xe = new XeMay(bienSo, hangXe, mauSac, soLuong, dungTich, giaTien, loaiXe);
                break;
        }

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblXe.getModel();
        model.addRow(new Object[]{
            xe.getBienSo(),
            xe.getHangXe(),
            xe.getMauSac(),
            xe.getSoLuong(),
            xe.getDungTich(),
            loaiXe,
            xe.getGiaTien(),
            xe.tongTien()
        });
danhSachXe.add(xe);

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Lỗi nhập dữ liệu: " + e.getMessage());
    }


    }//GEN-LAST:event_btnThemActionPerformed1

    private void txtTuKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuKhoaActionPerformed

    private void txtGiaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaTienActionPerformed

    private void cbLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiXeActionPerformed

    private void txtDungTichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDungTichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDungTichActionPerformed

    private void txtHangXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHangXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHangXeActionPerformed

    private void txtMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMauSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMauSacActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtBienSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBienSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBienSoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
BaoDuongForm form = new BaoDuongForm(danhSachXe);
form.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                      
    NhapHangForm form = new NhapHangForm(danhSachXe);
    form.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiXe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblXe;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtDungTich;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtHangXe;
    private javax.swing.JTextField txtMauSac;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}
