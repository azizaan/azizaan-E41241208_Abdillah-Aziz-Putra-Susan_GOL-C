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

public class Barang extends JFrame {
    public Barang() {
        setTitle("Form Data Barang");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // atau DISPOSE_ON_CLOSE jika mau dashboard tetap terbuka
        setLocationRelativeTo(null);
        add(new JLabel("Form Barang", SwingConstants.CENTER));
    }
}
