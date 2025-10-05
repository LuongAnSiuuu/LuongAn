package quanlyxe;

import java.awt.*;
import javax.swing.*;

public class LoginForm extends JFrame {

    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLogin;
    private JLabel lblTitle, lblUser, lblPass, lblStatus;

    public LoginForm() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Đăng nhập hệ thống");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 320);
        setLocationRelativeTo(null);
        setResizable(false);

        // Màu nền nhẹ
        JPanel panel = new JPanel();
        panel.setBackground(new Color(210, 230, 255));
        panel.setLayout(null);

        // Tiêu đề
        lblTitle = new JLabel("ĐĂNG NHẬP ", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitle.setForeground(new Color(25, 70, 150));
        lblTitle.setBounds(50, 25, 320, 30);
        panel.add(lblTitle);

        // Nhãn và ô nhập tài khoản
        lblUser = new JLabel("Tài khoản:");
        lblUser.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblUser.setBounds(60, 85, 80, 25);
        panel.add(lblUser);

        txtUser = new JTextField();
        txtUser.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtUser.setBounds(150, 85, 200, 30);
        panel.add(txtUser);

        // Nhãn và ô nhập mật khẩu
        lblPass = new JLabel("Mật khẩu:");
        lblPass.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblPass.setBounds(60, 130, 80, 25);
        panel.add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtPass.setBounds(150, 130, 200, 30);
        panel.add(txtPass);

        // Nút đăng nhập
        btnLogin = new JButton("Đăng nhập");
        btnLogin.setBackground(new Color(70, 130, 180));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnLogin.setFocusPainted(false);
        btnLogin.setBorder(BorderFactory.createEmptyBorder());
        btnLogin.setBounds(150, 185, 200, 35);
        panel.add(btnLogin);

        // Label thông báo
        lblStatus = new JLabel("", SwingConstants.CENTER);
        lblStatus.setBounds(60, 230, 300, 25);
        lblStatus.setForeground(Color.RED);
        lblStatus.setFont(new Font("Segoe UI", Font.ITALIC, 13));
        panel.add(lblStatus);

        // bảng dăng nhập
        btnLogin.addActionListener(e -> {
            String user = txtUser.getText().trim();
            String pass = new String(txtPass.getPassword()).trim();

            if (user.equals("admin") && pass.equals("123456")) {
                new QuanLyXe().setVisible(true);
                dispose();
            } else {
                lblStatus.setText(" Sai tài khoản hoặc mật khẩu!");
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
