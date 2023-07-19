package things;
import java.util.Random;
public class Phone {
    private String number;
    private double price;
    public Phone(String number){

        this.number = number;
        Random random = new Random();
        this.price = 150 + random.nextDouble() * (1450 - 150);
    }//end of Phone constructor
    public String getNumber(){
        return number;

    }//end of getNumber
    public double getPrice(){
        return price;
    }//end of getPrice
    public void displayInfo(){
        System.out.printf("Type-> Phone-> \t\t\t%-10s \t\t\t\t\t\tPrice: %-10.2f\n", number, price);

    }//end of displayInfo
}//end of Phone
