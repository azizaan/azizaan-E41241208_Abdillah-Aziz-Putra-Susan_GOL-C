/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara_9_10;

/**
 *
 * @author ACER
 */

import java.util.Scanner;

public class minggu3_soal_1 {
    public static void main(String[] args) {
        int awal,akhir;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka batas awal: ");
        awal = sc.nextInt();
        System.out.print("Masukkan angka batas akhir: ");
        akhir = sc.nextInt();
        
        
        for(int i = awal; i < akhir; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
