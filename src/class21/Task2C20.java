package class21;

public class Task2C20 {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.calcArea();
    }
}
class Shape{
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{
    double area;

    Circle(double radius){
        super(radius);
    }

    void calcArea(){
        System.out.println(Math.PI*Math.pow(radius,2));

    }
}
