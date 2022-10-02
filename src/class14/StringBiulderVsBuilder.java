package class14;

public class StringBiulderVsBuilder {
    public static void main(String[] args) {
            StringBuilder stingBuilder=new StringBuilder("Today is java class");
            StringBuffer stringBuffer=new StringBuffer("Today is java class");
            String str="Java is very easy";
            StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);
    }
}
