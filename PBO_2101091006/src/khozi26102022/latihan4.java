/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi26102022;

/**
 *
 * @author asus
 */
public class latihan4 {
public static void main(String[] args) {
        String[][] entry = {{"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}};
        
        for(int i=0; i<entry.length; i++)
        {
        System.out.println("Name    : " + entry[i][0]);
        System.out.println("Tel. #  : " + entry[i][1]);
        System.out.println("Address : " + entry[i][2] + "\n");
        }
    }
}
