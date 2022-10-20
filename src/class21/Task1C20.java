package class21;

public class Task1C20 {
    public static void main(String[] args) {
        UserInfo user=new UserInfo("Liza","12234354", "McKinney");
        user.printUserDetails();
    }
}
class UserClass{
    String name;
    String mobileNumber;
    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}

class UserInfo extends UserClass{
    String address;
    UserInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address=address;
    }

    void printUserDetails(){
        System.out.println("Name "+name+" Mobile number "+mobileNumber+" Address "+address);
    }
}