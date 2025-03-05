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

public class minggu3_soal_2 {
    public static void main(String[] args) {
        System.out.print("\t Do While \n" + "Bilangan kelipatan 2-100 \n" + "==================== \n");
        int awal = 1;
        do{
            System.out.print(""+awal);
            awal *=2;
        }while(awal <=100);
    }
}
