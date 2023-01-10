
package khozi30112022;


public class Polimorfis {
    public static void main(String[] args){
        Person ref;
        Student student = new Student();
        Employee employee = new Employee ();
        
        ref = student;
        String name = ref.getName();
        System.out.println(name);
        //
        
        ref = employee;
        String name1 = ref.getName();
        System.out.println(name1);
    }
        public static void printInformation(Person Person){
           if(Person instanceof Student){
               System.out.print("Name student "+Person.getName ());
           }else if(Person instanceof Employee){
               System.out.print("Name employee "+Person.getName ());
           }
        }
}

