/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi07122022;


public class ExampleException {
    public static void main(String[] args) {
        try{
            int a = 1/0;
            System.err.println("Hasil a ="+a);
        }
        catch(java.lang.ArithmeticException ex){
            System.out.println("Error "+ex.getMessage());
        }
    }
    
}
