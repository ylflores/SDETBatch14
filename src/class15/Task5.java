package class15;

public class Task5 {
    String createEmail(String name, String lastName, String emailType){
        return (name+lastName+"@"+emailType+".com").toLowerCase();
    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        String fullEmail=task5.createEmail("John","Snow","gmail");
        System.out.println("fullEmail = " + fullEmail);
        
    }
}
