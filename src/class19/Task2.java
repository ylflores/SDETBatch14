package class19;

public class Task2 {
    public static void main(String[] args) {
        Book headFirstJava=new Book("Head First Java", "0really", 30,123456);
        Book dataStructures=new Book("Head First Java", "0really", 30);
    }
    }

class Book{
    String name;
    String author;
    int pages;
    int ISBN;

    public Book(String name, String author, int pages, int ISBN) {
        this(name, author, pages);
        this.ISBN=ISBN;
    }

    public Book (String name, String author, int pages){
        this.name = name;
        this.author=author;
        this.pages=pages;
    }
}


