package class20;

public class Task2 {
    public static void main(String[] args) {
        A.printF();
        W.printF();
    }
}
class A{
    static void printF(){
        System.out.println("F");
    }
}
class W extends A{

}