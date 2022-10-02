package class14;

public class Task1 {
    public static void main(String[] args) {
        /* create string that will hold a sentance.
        Write a program to get a new Sring without any spaces
         */
        String str="We love Java";
        str=str.replaceAll(" ","");
        System.out.println("str = " + str);
    }
}
