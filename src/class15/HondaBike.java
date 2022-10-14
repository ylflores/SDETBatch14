package class15;

public class HondaBike {

    static int topSpeed=200;
    static int noOfTires=2;
    String model;
    int year;

    public void printTotalDistance(int Gallons, int avg){
        double distance=Gallons/10;
        System.out.println("Your bike can go max "+distance+" with "+Gallons+" gas");
    }

    public static void main(String[] args) {
        HondaBike ybr=new HondaBike();
        ybr.model="ybr100";
        ybr.printTotalDistance(40, 2);

    }

}
