package class15;

public class Task2 {
    void printEvenOdd(int num){
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        Task2 nm=new Task2();
        nm.printEvenOdd(5);
    }
}
