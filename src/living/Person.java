package living;
import things.BookBag;
import things.Book;
import things.Pen;
import things.PencilBag;
import things.Phone;

public class Person {

    private String firstName;
    private String lastName;
    private BookBag bookBag = null;

    public Person(String firstName, String lastName){

    }//end of Person constructor
    public String getFirstName() {
        return firstName;
    }//end of getFirstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }//end of setFirstName
    public String getLastName() {
        return lastName;
    }//end of getLastName
    public void setLastName(String lastName){
        this.lastName = lastName;
    }//end of getLastName
    public BookBag getBookBag() {
        return bookBag;
    }//end of getBookBag
    public void setBookBag(BookBag bookBag) {
        this.bookBag = bookBag;
    }//end of setBookBag
    public double totalPriceOfPossessions(){
        double totalPrice = 0.0;
        for (Object item : bookBag.getItems()) {
            if (item instanceof Book) {
                totalPrice += ((Book) item).getPrice();
            } else if (item instanceof PencilBag) {
                PencilBag pencilBag = (PencilBag) item;
                for (Pen pen : pencilBag.getPens()) {
                    totalPrice += pen.getPrice();
                }
            } else if (item instanceof Phone) {
                totalPrice += ((Phone) item).getPrice();
            }
        }
        return totalPrice;

    }

}//end of Person
