package class19;

public class Animal {
    String name;
    String breed;
    String color;

    public void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Color "+color);
    }

    Animal(String name, String breed, String color){
        this.name=name;
        this.breed=breed;
        this.color=color;
    }
}
