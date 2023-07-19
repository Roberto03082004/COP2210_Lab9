package things;
import living.Person;
import java.util.ArrayList;


public class BookBag {

    private Person owner;
    //private final ArrayList items;
    private final ArrayList<Object> items;


    public BookBag(Person owner) {
        this.owner = owner;
        this.items = new ArrayList<>(); // no generic type

    }//end of BookBag constructor
    public Person getOwner() {
        return owner;
    }//end of getOwner
    public void setOwner(Person owner) {
        this.owner = owner;
    }//end of getOwner
    public ArrayList getItems() {
        return items;
    }//end of getItems
    public void listItems(){

    }//end of listItems
    public void displayItems(){
        for (Object item : items) {
            if (item instanceof Phone) {
                Phone phone = (Phone) item;
                phone.displayInfo();
            } else if (item instanceof Book) {
                Book book = (Book) item;
                book.displayInfo();
            }else if (item instanceof PencilBag) {
                PencilBag pencilBag = (PencilBag) item;
                pencilBag.displayContains();
            }
        }

        /*for (Phone phone : items) {
            phone.displayInfo();
        }*/


    }//end of displayItems
}//end of BookBag
