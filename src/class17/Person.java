package class17;

public class Person {
    String name;
    String country;
    String color;
    int age;
    double weight;
    String hairColor;
    String eyeColor;
    double height;
    char gender;

    public Person(){

    }
    public Person(String perName){
        name=perName;
    }

    public Person(String name, String country, String color, int age, double weight, String hairColor, String eyeColor, double height, char gender) {
        this.name = name;
        this.country = country;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.height = height;
        this.gender = gender;
    }

    public static void main(String[] args) {

    }
}

