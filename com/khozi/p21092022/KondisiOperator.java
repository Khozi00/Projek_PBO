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
public class KondisiOperator {
    public static void main( String[] args ){ 
        String status = ""; 
        int nilai = 80; 

        //exp1?exp2: exp3;
        status = (nilai >= 60)?"Berhasil":"Gagal"; 
        //print status 
        System.out.println( status ); 
       }

}
