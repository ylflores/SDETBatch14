package class18;

public class Students {
    String name;
    double score1;
    double score2;
    double score3;

    public Students(String stName, double grade1, double grade2, double grade3){
        name=stName;
        score1=grade1;
        score2=grade2;
        score3=grade3;
    }
    void calcPrintAvgGrade(){
        System.out.println(name+" "+(score1+score2+score3)/3);
    }

    public static void main(String[] args) {
        new Students("Liza",45,55,65).calcPrintAvgGrade();
    }
}
