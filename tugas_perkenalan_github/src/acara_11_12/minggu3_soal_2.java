/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara_11_12;

/**
 *
 * @author ACER
 */

import java.util.*;
import java.util.Scanner;

public class minggu3_soal_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Deret: ");
        int jumlahderet = sc.nextInt();
       
        int[] deret = new int[jumlahderet];
        Random arr = new Random();
        
        for (int i = 0; i < jumlahderet; i++){
            deret[i] = arr.nextInt(100);
        }
        
        System.out.println("Deret angka acak");
        for (int angka : deret){
            System.out.print(angka + "");
        }
    }
}
