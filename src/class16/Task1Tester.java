package class16;

public class Task1Tester {
    public static void main(String[] args) {
        SyntaxEmployee asgharEmp=new SyntaxEmployee();
        asgharEmp.empID="123";
        asgharEmp.salary=10000;


        System.out.println(SyntaxEmployee.CEO);
        SyntaxEmployee mozzamEmp=new SyntaxEmployee();
        mozzamEmp.empID="123";
        mozzamEmp.salary=10000;
        System.out.println(SyntaxEmployee.CEO );
    }
}
