
package khozi30112022;

public class Student extends Person {

    public Student() {
        super("Khozi", "Payakumbuh");
        super.name ="Khozi";
        super.address ="some address ";
        System.out.println("Insiden Student:Constructor ");
    }
    @Override
    public String getName(){ 
        System.out.println("Student: getName"); 
         return name; 
 }
    public static void main(String[] args) {
        Student Khozi = new Student();
        Khozi.name ="Khozi";
        System.out.println(Khozi.getName());
    }
}
