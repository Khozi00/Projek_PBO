/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi05102022;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Latihan1 {
    public static void main( String[] args ){
    BufferedReader dataIn = new BufferedReader(new
    InputStreamReader( System.in) );
    String name = "";
    String Alamat = "";
    String Jurusan = "";




try{
    System.out.print("Please Enter Your Name:");
    name = dataIn.readLine();
    System.out.print("Alamat:");
    Alamat = dataIn.readLine();
System.out.print("Jurusan:");
Jurusan= dataIn.readLine();

}catch( IOException e ){
System.out.println("Error!");
}
System.out.print("Hello " + name );
       
System.out.print(" di " + Alamat );
       
System.out.println(" Selamat datang di " + Jurusan );
}
}
