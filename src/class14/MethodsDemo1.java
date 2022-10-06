package class14;

public class MethodsDemo1 {

    void printHello(){
        System.out.println("Hello world");
        System.out.println("Hello Java");
    }
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodsDemo1 obj=new MethodsDemo1();
        obj.printHello();
        obj.printWord("Dont worry");
    }


}
