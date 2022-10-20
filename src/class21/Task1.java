package class21;

public class Task1 {
    public static void main(String[] args) {

        AreaManager rectangle = new AreaManager();
        rectangle.calcArea(5, 6);
        AreaManager cube=new AreaManager();
        cube.calcArea(4);

    }
}

class AreaManager{
    void calcArea(double length, double width){
        System.out.println(length*width);
    }
    void calcArea(double length){
        System.out.println(length*length);
    }
    void volume(double length){
        System.out.println(Math.pow(length,3));
    }
}