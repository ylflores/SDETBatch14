package class21;

public class Task3 {
}

class OverloadStat{
   private static void print(){
        System.out.println("I love Java");
    }
   private static void print(String str){
        System.out.println("This is the String "+str);
    }
    private static void print(String str, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        print();
        print("Java");
        print("Java",6);
    }
}