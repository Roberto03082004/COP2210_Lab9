package things;
import java.util.Random;

public class Book {

    private String subject;
    private double price;
    public Book(String subject, double price) {
        this.price = price;
        this.subject = subject;

    }//end of Book constructor
    public String getSubject() {
        return subject;
    }//end of getSubject
    public double getPrice() {
        return price;
    }//end of getPrice
    public void displayInfo() {
        System.out.printf("Type-> Book-> \t\t\tSubject: %-10s \t\t\t\tPrice: %-10.2f\n", subject, price);

    }//end of displayInfo
}//end of Book
