package khozi02112022;

public class StudentRecord1 {
    public static void main(String[] args) {
         StudentRecord student3 = new StudentRecord ("Budi","Padang",20);
         student3.setAge(20);
         student3.print("");
         StudentRecord student4 = new  StudentRecord();
         student4.print("");
         System.out.println("Jumlah siswa =" + student3.getStudentCount());
    }
   
}