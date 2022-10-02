package class14;

import java.util.Arrays;

public class StringRec {
    public static void main(String[] args) {
        String str="kekvgvjb*^^798389fofhHIHID";
        str=str.replaceAll("[^a-z]", "");
        System.out.println("str = " + str);
        String sentence="Batch 14 is Great. Batch 14 is excellent! Batch 14 is juat amazing";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = " + Arrays.toString(split));
    }
}
