package class20;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Liza",24,4);
        teacher.teach();
        MathTeacher mathTeacher=new MathTeacher("Sasha", 25,6);
        mathTeacher.teachTheClass();
        mathTeacher.teach();
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher("Don", 45,4);
        chemistryTeacher.teachTheClass();
        chemistryTeacher.teach();
        PianoTeacher pianoTeacher=new PianoTeacher("Mason", 2,2,"Piano");
        pianoTeacher.teachTheClass();
        pianoTeacher.teach();

    }
}
