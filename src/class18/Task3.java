package class18;

import RplsPractise.Task;

public class Task3 {
    /* Write a java class that has 4 constructors with 4 different access levels of constructor.
    Create 4 objects of that class: 1 -inside the class, 2- from outside the class,
    3 - from class in different package.
     */
    private Task3(){
        System.out.println("Private");
    }
    Task3(String name){
        System.out.println("Default");
    }
    protected Task3(int age){
        System.out.println("Protected");
    }
    public Task3(boolean isTrue){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new Task3();
        new Task3("thank you");
        new Task3(10);
        new Task3(true);
    }

}
