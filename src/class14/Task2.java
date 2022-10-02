package class14;

public class Task2 {
    public static void main(String[] args) {
        /*Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric characters are there in the String.
         */
        String str="slhgvie&(&(*887r9uru3";
        str=str.replaceAll("[^a-zA-z0-9]","");
        System.out.println("str = " + str);
        System.out.println((str.length()));


    }
}
