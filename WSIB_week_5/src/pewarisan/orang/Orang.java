/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan.orang;

/**
 *
 * @author ACER
 */
public class Orang {
    private String nama;
    private double tinggi;
    private double berat;
    
    public Orang(String nama, double tinggi, double berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String toString(){
        return ("nama : "+nama+"\nTinggi : "+ tinggi +"\nBerat : "+berat);
    }
}
