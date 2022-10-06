package class14;

public class Task3 {
    public static void main(String[] args) {


    /*
    You have a String a="Is it Saturday? Is it Raining? Do we have Java Class Today?"
    How would you find out how man sentences are there?
     */
    String str="Is it Saturday? Is it Raining? Do we have Java Class Today?";
    String [] s=str.split("[?]");
    System.out.println(s.length);
}
}
