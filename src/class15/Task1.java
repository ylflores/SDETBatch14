package class15;

public class Task1 {
    void printLarger(int num1,int num2){
        if(num1>num2){
            System.out.println("Number 1 is larger");
        }else if(num2>num1){
            System.out.println("Number 2 is larger");
        }else{
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Task1 nm=new Task1();
        nm.printLarger(12,14);
    }

}
