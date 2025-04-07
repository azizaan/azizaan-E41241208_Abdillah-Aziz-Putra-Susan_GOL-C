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

public class FormPenjualan extends JFrame {

    public FormPenjualan() {
        setTitle("Form Penjualan");
        setSize(1100, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(null); // Pakai null layout agar bebas atur posisi
        mainPanel.setBackground(new Color(0, 0, 102)); // Biru tua
        add(mainPanel);

        // Judul
        JLabel title = new JLabel("Penjualan", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(Color.WHITE);
        title.setBounds(0, 10, 1000, 30);
        mainPanel.add(title);

        // Label dan TextField sisi kiri
        String[] labels = {"No Transaksi", "Tgl Transaksi", "Kode Barang", "Nama Barang", "Stock", "Harga", "Jumlah", "Total"};
        int y = 60;
        for (String label : labels) {
            JLabel lbl = new JLabel(label);
            lbl.setBounds(50, y, 150, 25);
            lbl.setForeground(Color.WHITE);
            JTextField txt = new JTextField();
            txt.setBounds(200, y, 250, 25);
            mainPanel.add(lbl);
            mainPanel.add(txt);
            y += 35;
        }

        // Panel data member
        JPanel panelMember = new JPanel(null);
        panelMember.setBounds(550, 60, 400, 100);
        panelMember.setBackground(new Color(0, 0, 153));
        mainPanel.add(panelMember);

        JLabel lblKodeMember = new JLabel("Kode Member");
        lblKodeMember.setBounds(10, 10, 120, 25);
        lblKodeMember.setForeground(Color.WHITE);
        JTextField txtKodeMember = new JTextField();
        txtKodeMember.setBounds(140, 10, 250, 25);
        panelMember.add(lblKodeMember);
        panelMember.add(txtKodeMember);

        JLabel lblNamaMember = new JLabel("Nama Member");
        lblNamaMember.setBounds(10, 40, 120, 25);
        lblNamaMember.setForeground(Color.WHITE);
        JTextField txtNamaMember = new JTextField();
        txtNamaMember.setBounds(140, 40, 250, 25);
        panelMember.add(lblNamaMember);
        panelMember.add(txtNamaMember);

        JLabel lblDiskon = new JLabel("Diskon");
        lblDiskon.setBounds(10, 70, 120, 25);
        lblDiskon.setForeground(Color.WHITE);
        JTextField txtDiskon = new JTextField("0");
        txtDiskon.setBounds(140, 70, 50, 25);
        panelMember.add(lblDiskon);
        panelMember.add(txtDiskon);

        JLabel lblPersen = new JLabel("%");
        lblPersen.setBounds(195, 70, 20, 25);
        lblPersen.setForeground(Color.WHITE);
        panelMember.add(lblPersen);

        // Label sisi kanan
        String[] kanan = {"Total Setelah Diskon", "Bayar", "Kembali"};
        y = 200;
        for (String label : kanan) {
            JLabel lbl = new JLabel(label);
            lbl.setBounds(550, y, 150, 25);
            lbl.setForeground(Color.WHITE);
            JTextField txt = new JTextField();
            txt.setBounds(700, y, 250, 25);
            mainPanel.add(lbl);
            mainPanel.add(txt);
            y += 35;
        }

        // Tombol-tombol
        // Tambahkan tombol-tombol di bawah Total (di baris yang benar)
        JButton btnAdd = new JButton("ADD");
        btnAdd.setBounds(470, 330, 80, 30);
        mainPanel.add(btnAdd);

        JButton btnDelete = new JButton("DELETE");
        btnDelete.setBounds(560, 330, 80, 30);
        mainPanel.add(btnDelete);

        JButton btnCount = new JButton("COUNT");
        btnCount.setBounds(650, 330, 80, 30);
        mainPanel.add(btnCount);

        JButton btnSave = new JButton("SAVE");
        btnSave.setBounds(740, 330, 80, 30);
        mainPanel.add(btnSave);

        JButton btnPrint = new JButton("PRINT");
        btnPrint.setBounds(830, 330, 80, 30);
        mainPanel.add(btnPrint);

        JButton btnClear = new JButton("CLEAR");
        btnClear.setBounds(920, 330, 80, 30);
        mainPanel.add(btnClear);

        // Tabel kiri
        JTable tableKiri = new JTable(5, 4);
        JScrollPane scrollKiri = new JScrollPane(tableKiri);
        scrollKiri.setBounds(100, 370, 400, 150);
        mainPanel.add(scrollKiri);

        // Tabel kanan
        JTable tableKanan = new JTable(5, 4);
        JScrollPane scrollKanan = new JScrollPane(tableKanan);
        scrollKanan.setBounds(520, 370, 400, 150);
        mainPanel.add(scrollKanan);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormPenjualan().setVisible(true);
        });
    }
}
