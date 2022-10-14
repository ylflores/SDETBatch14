package class16;

public class Student {
   String name;
   String id;
   static int numberOfStudents;




    public static void main(String[] args) {
        Student roman = new Student();
        roman.id="1";
        roman.name="Roman";
        Student.numberOfStudents++;

        Student sonam = new Student();
        roman.id="2";
        roman.name="Sonam";
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);
    }
}
