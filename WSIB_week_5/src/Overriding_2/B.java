/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding_2;

import Overriding.*;

/**
 *
 * @author ACER
 */
public class B extends A {
    public void TampilkanKeLayar(){
        super.TampilkanKeLayar();
        System.out.println("Method milik class B dipanggil");
    }
}
