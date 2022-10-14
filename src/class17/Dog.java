package class17;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    Dog(String dogName,String dogBreed, String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("name " + name+" breed "+ breed+" age "+age);
    }

    public static void main(String[] args) {
        Dog dog=new Dog("Tommy","Huskey","Pink",10,30);
        dog.printInfo();

    }

}
