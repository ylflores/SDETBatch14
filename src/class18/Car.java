package class18;

public class Car{
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;

    void printCarDetails(){
        System.out.println("Model "+model+"make "+make+"color "+color);
    }
}

class BMW extends Car {
    double engineCC;

}
class Tesla extends Car {

}
class Toyota extends Car {

    double engineCC;

}
class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.model = "X5M";
        bmw.make="BMW";
        bmw.color="Black";
        bmw.printCarDetails();
    }
}
