/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi19102022;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class latihan5 {
    public static void main(String[] args) {
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        int nilai1 = 0 ;
        int nilai2 = 0 ;
        int nilai3 = 0 ;
        int rata2;
        int jumlah;
        
        
        try {            
            System.out.print("Nilai Ujian 1  : ");
            nilai1 = Integer.parseInt(dataInput.readLine());  
            
            System.out.print("Nilai Ujian 2  : ");
            nilai2 = Integer.parseInt(dataInput.readLine());
            
            System.out.print("Nilai Ujian 3  : ");
            nilai3 = Integer.parseInt(dataInput.readLine());
            
        } catch (IOException ex) {
            Logger.getLogger(latihan5.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        jumlah = nilai1 + nilai2 + nilai3;
        System.out.println("Jumlah Nilai       = " +jumlah);
        rata2 = jumlah / 3;
        if (rata2 >= 60){
            System.out.print("Rata-Rata        = " +rata2);
            System.out.println(" :) ");
        }
        else{
            System.out.print("Rata-Rata        = " +rata2);
            System.out.println(" :-( ");
        }
        
    }
}
