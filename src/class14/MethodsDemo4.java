package class14;

public class MethodsDemo4 {
    boolean mystery(){

        return false;
    }

    String mystery2(int num){
        return "Java";
    }
    String method(String word){
        if(word.equals("Java")){
            return "python";
        }else{
            return "Java";
        }
    }

    public static void main(String[] args) {
        MethodsDemo4 mDemo4=new MethodsDemo4();
        System.out.println(mDemo4.mystery());
        System.out.println(mDemo4.mystery2(5));
        System.out.println(mDemo4.method("python"));
    }
}
