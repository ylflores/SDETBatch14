package class21;

public class Employee {
    String name;
    double baseSalary=40000;
    double bonus=20000;
    void calcSalary(){
        System.out.println(baseSalary+bonus);
    }
}
class Developer extends Employee{
    void calcSalary(){
        System.out.println(baseSalary*2+(1.5*bonus));
    }
}
class Tester extends Employee{
    void calcSalary() {
        System.out.println(baseSalary+(2*bonus));
    }
}
class OfficeB extends Employee{

}
class Test  {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.calcSalary();
    }
}
class EmployeeTester {
    public static void main(String[] args) {
        OfficeB oB = new OfficeB();
        oB.calcSalary();

        Tester tester = new Tester();
        tester.calcSalary();

        Developer dev=new Developer();
        dev.calcSalary();

    }
}