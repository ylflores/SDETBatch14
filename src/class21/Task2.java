package class21;

public class Task2 {
    public static void main(String[] args) {
        Programming obj = new Programming("L");
    }
}



class Programming{
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String line){
        System.out.println("This is the String "+line);
    }
}