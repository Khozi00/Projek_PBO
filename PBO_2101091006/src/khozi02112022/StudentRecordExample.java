
package khozi02112022;

public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        student1.setName("Khozi");
        student1.setAddress("Payakumbuh");
        student1.setAge (20);
        student1.setMathGrade(100);
        student1.setEnglishGrade(98);
        student1.setScienceGrade(95);
        
        System.out.println("Nama            :" + student1.getName());
        System.out.println("Alamat          :" + student1.getAddress());
        System.out.println("Umur            :" + student1.getAge());
        System.out.println("Matematika      :" + student1.getMathGrade());
        System.out.println("B.Inggris       :" + student1.getEnglishGrade());
        System.out.println("Pengetahuan     :" + student1.getScienceGrade());
        System.out.println("Rata-Rata       :" + student1.getAverage());
        System.out.println("Nilai Maksimum  :" + student1.getMax());
        System.out.println("=============================================" );
        StudentRecord student2 = new StudentRecord();
        student2.setName ("Budi");
        student2.setAddress("Padang");
        student2.setAge (20);
        student2.setMathGrade(90);
        student2.setEnglishGrade(98);
        student2.setScienceGrade(95);
        student2.print("");
        student2.print(student2.getEnglishGrade(),student2.getMathGrade(),
                student2.getScienceGrade());
        
        
    }
}