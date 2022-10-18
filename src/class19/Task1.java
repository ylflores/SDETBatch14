package class19;

public class Task1 {
    public static void main(String[] args) {
        Student josh=new Student("Josh", "Earth");
        josh.displayInf0();
    }
}

class Student{
    String name;
    String address;
    public Student(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInf0(){
        System.out.println("Name "+name+" Address "+address);
    }
}
