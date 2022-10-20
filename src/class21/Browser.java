package class21;

import org.w3c.dom.ls.LSOutput;

public class Browser {
    void openBrowser(){
        System.out.println("Opening Browser");
    }
    void navigate(){
        System.out.println("Opening the URL");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}

class Chrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser in less than 1 sec");
    }
}
class FireFox{
    void openBrowser(){
        System.out.println("Opening the browser in less than 2 sec");
    }
}
