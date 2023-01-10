/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khozi.p21092022;

/**
 *
 * @author asus
 */
public class Latihan3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 23;
        int z = 5;
        int max;
      
        System.out.println("Number 1         = "+x);
        System.out.println("Number 2         = "+y);
        System.out.println("Number 3         = "+z);
        max=(y>=x)?y:x;
        max=(z>max)?z:max;
        System.out.println("Nilai Tertingginya Adalah Angka  = "+max);
    }

}