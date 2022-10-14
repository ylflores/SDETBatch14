package review2;

public class Dog {
    String name;
    int weight;
    static String breed;

    void printInfo(){
        System.out.println("Dog features: "+name+", "+weight+", "+breed);
    }

    void love(String thing){
        System.out.println(name+" loves "+thing);
    }
    double getPrice(){
        if(weight<5){
            return 100;
        }else if(weight>10){
            return 300;
        }else{
            return 100;
        }
    }
    String bark(){
        String noise;
        if(weight<5){
            noise="loud";
        }else if(weight<20){
            noise="woof woof";
        }else{
            noise="gav gav";
        }return noise;
    }
}
