/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_penjualan;

/**
 *
 * @author ACER
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame {

    public dashboard() {
        setTitle("Aplikasi Penjualan Sederhana");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(0, 0, 102)); // Biru tua

        setLayout(new BorderLayout());

        // Panel judul
        JLabel titleLabel = new JLabel("APLIKASI PENJUALAN SEDERHANA", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setForeground(Color.WHITE);
        add(titleLabel, BorderLayout.NORTH);

        // Panel gambar toko
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon icon = new ImageIcon(getClass().getResource("/aplikasi_penjualan/img/store.png"));
        Image scaledImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaledImage));
        add(imageLabel, BorderLayout.CENTER);

        // Panel tombol menu
        JPanel menuPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        menuPanel.setBackground(new Color(0, 0, 102));

        menuPanel.add(createButton("Data Barang", "img/barang.png", new Barang()));
        menuPanel.add(createButton("Data Supplier", "img/supplier.png", new Supplier()));
        menuPanel.add(createButton("Data Member", "img/member.png", new Member()));
        menuPanel.add(createButton("Pembelian", "img/beli.png", new FormPembelian()));
        menuPanel.add(createButton("Penjualan", "img/jual.png", new FormPenjualan()));

        add(menuPanel, BorderLayout.SOUTH);
    }

    private JButton createButton(String text, String iconPath, JFrame targetFrame) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/aplikasi_penjualan/" + iconPath));
        Image image = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);
        JButton button = new JButton(text, icon);
        button.setPreferredSize(new Dimension(150, 50));
        button.setFocusPainted(false);

        // Tambahkan fungsi klik tombol
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                targetFrame.setVisible(true);  // Buka form tujuan
                dispose();                     // Tutup dashboard
            }
        });

        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new dashboard().setVisible(true);
        });
    }
}
