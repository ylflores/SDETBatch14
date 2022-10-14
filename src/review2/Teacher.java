package review2;

public class Teacher {
    String name, lastName;
    String gender;
    String subject;
    double salary;
    static String school;

    void printInfo(){
        System.out.println(name+lastName);

    }

    Teacher(String fName, String lName){
        name = fName;
        lastName=lName;

    }
}
