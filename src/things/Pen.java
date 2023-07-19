package things;
import java.util.Random;
public class Pen {
    private String color;
    private double price;
    public Pen(String color, double price) {
        this.price = price;
        this.color = color;
    }//end of Pen constructor
    public String getColor() {
        return color;
    }//end of getColor
    public double getPrice() {
        return price;
    }//end of getPrice
    public void displayInfo(){
        System.out.printf("Type-> Pen-> \t\t\tColor: %-15s \t\t\t\tPrice: %-10.2f\n", color, price);

    }//end of displayInfo
}//end of Pen
