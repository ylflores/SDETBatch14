package class20;

public class Task3 {

}
class Teacher{
   protected String name;
   protected int age;
   protected int experience;

     Teacher(String name, int age, int experience){
        this.name=name;
        this.age=age;
        this.experience=experience;
    }

    void teach(){
        System.out.println(name+" is teaching");
    }

}
class MathTeacher extends Teacher{

    void teachTheClass(){
        System.out.println("I'm goint to teach Math");
    }

    MathTeacher(String name, int age, int experience){
        super(name, age, experience);
    }
}

class ChemistryTeacher extends Teacher{

    void teachTheClass(){
        System.out.println("I'm going to teach Chemistrty");
    }
    ChemistryTeacher(String name, int age, int experience) {
        super(name, age, experience);
    }
}

class PianoTeacher extends Teacher{
    String pianoType;
    void teachTheClass(){
        System.out.println("I'm going to teach Piano");
    }
    PianoTeacher(String name, int age, int experience, String pianoType) {
        super(name, age, experience);
        this.pianoType=pianoType;
    }
}