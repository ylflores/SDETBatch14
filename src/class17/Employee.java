package class17;

public class Employee {
    private String name;
    private String department;
    private double salary;
    String id;
    private int age;
    private double actualSalary;
    static String companyName="Syntax";

    Employee(String empName, String empDep, double empSalary, int empAge){
        name=empName;
        department=empDep;
        salary=empSalary;
        age=empAge;
    }

    void printSalary(){
        actualSalary=salary+2000+10000;
        System.out.println(actualSalary);
    }

    void calculatePrintTax(){
        double tax=actualSalary*0.3;
        System.out.println("Tax"+tax);

    }


}
