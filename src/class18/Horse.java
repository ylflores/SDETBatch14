package class18;

public class Horse extends Animal{


    public Horse(String name, String breed, int age, double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }
    void printInfo(){
        System.out.println("now this will be printed");
        System.out.println("name "+name+" breed "+breed+" age "+age+" weight "+weight+"lb");
    }

    public static void main(String[] args) {
        Horse horseObj=new Horse("Spirit", "Stallion", 10,400);
        horseObj.printInfo();
    }
}
