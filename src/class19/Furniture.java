package class19;

public class Furniture {
    String color="green";
}
class Chair extends Furniture{
    String color="red";
    void printColor(){
        String color="black";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
class testChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
