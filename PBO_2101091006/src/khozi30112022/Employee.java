/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi30112022;
    
public class Employee extends Person {
    @Override
    public String getName() {
        super.name ="Akbar";
        System.out.println ("Employee Name :" + name );
        return name;
    }
}

