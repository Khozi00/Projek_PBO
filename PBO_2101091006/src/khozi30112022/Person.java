
package khozi30112022;

public class Person {

    protected String name;
    protected String address;
    
    public Person (){
        System.out.println(" Inside Person:Constructor");
         name = "";
        address = "";
    }

        public Person (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        System.out.println("Person: getName");
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String add) {
        this.address = add;
    }
}
