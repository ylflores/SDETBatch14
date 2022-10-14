package review2;

public class Shelter {
    public static void main(String[] args) {

        Dog.breed="Husky";

        Dog dog1=new Dog();
        dog1.name="Bobby";
        dog1.weight=20;
        double price=dog1.getPrice();
        dog1.printInfo();
        System.out.println(price);
        System.out.println(dog1.bark());

        Dog dog2=new Dog();
        dog2.name="Houston";
        dog2.weight=15;
        double price2=dog2.getPrice();
        dog2.printInfo();
        System.out.println(price2);
        System.out.println(dog2.bark());

        dog1.love("candy");

    }
}
