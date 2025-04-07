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

public class FormPembelian extends JFrame {

    public FormPembelian() {
        setTitle("Pembelian");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel biru utama
        JPanel panelInput = new JPanel(new GridBagLayout());
        panelInput.setBackground(new Color(0, 0, 102));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Judul di tengah atas
        JLabel title = new JLabel("Pembelian");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panelInput.add(title, gbc);
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        // Form kiri (label dan input)
        String[] labelKiri = {"No Transaksi", "Kode Supplier", "Nama Perusahaan", "Tgl Transaksi", "Nama Barang"};
        JTextField[] fieldKiri = new JTextField[labelKiri.length];
        for (int i = 0; i < labelKiri.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i + 1;
            JLabel label = new JLabel(labelKiri[i]);
            label.setForeground(Color.WHITE);
            panelInput.add(label, gbc);

            gbc.gridx = 1;
            fieldKiri[i] = new JTextField(15);
            panelInput.add(fieldKiri[i], gbc);
        }

        // Form kanan (label dan input)
        String[] labelKanan = {"Harga", "Jumlah", "Total"};
        JTextField[] fieldKanan = new JTextField[labelKanan.length];
        for (int i = 0; i < labelKanan.length; i++) {
            gbc.gridx = 2;
            gbc.gridy = i + 1;
            JLabel label = new JLabel(labelKanan[i]);
            label.setForeground(Color.WHITE);
            panelInput.add(label, gbc);

            gbc.gridx = 3;
            fieldKanan[i] = new JTextField(15);
            panelInput.add(fieldKanan[i], gbc);
        }

        // Panel tombol di bawah kanan (di samping Nama Barang dan Total)
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        JPanel tombolPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        tombolPanel.setBackground(new Color(0, 0, 102));
        tombolPanel.add(new JButton("SAVE"));
        tombolPanel.add(new JButton("EDIT"));
        tombolPanel.add(new JButton("CLEAR"));
        tombolPanel.add(new JButton("DELETE"));
        panelInput.add(tombolPanel, gbc);

        // Tabel transaksi di bagian bawah
        String[] kolom = {
            "No", "No Transaksi", "Kode Supplier", "Nama Perusahaan",
            "Kode Barang", "Nama Barang", "Jumlah", "Harga", "Total"
        };
        JTable table = new JTable(new Object[0][kolom.length], kolom);
        JScrollPane scrollPane = new JScrollPane(table);

        // Tambah ke frame
        add(panelInput, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormPembelian().setVisible(true);
        });
    }
}
