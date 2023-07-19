package things;
import java.util.ArrayList;

public class PencilBag {
    private final ArrayList<Pen> pens;

    public PencilBag() {
        this.pens = new ArrayList<>();

    }//end of PencilBag constructor
    public ArrayList<Pen> getPens() {
        return pens;
    }//end of getPens
    public void displayContains(){
        for (Pen pen : pens) {
            pen.displayInfo();
        }

    }//end of displayContains
}//end of PencilBag
