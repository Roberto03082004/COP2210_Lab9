package app;

import java.util.Random;

import things.Phone;
import living.Person;
import things.BookBag;
import things.Book;
import things.Pen;
import things. PencilBag;

public class Controller {
    public static void main(String[] args){
        yourInfoHeader();

        //Step 4, 5 & 6
        Phone phone = new Phone("326-671-5815");
        phone.displayInfo();

        Book book = new Book("Math", 139.71);
        book.displayInfo();

        Pen pen = new Pen("Green", 0.11);
        pen.displayInfo();

        // 1. Create a new instance of type Random named rndGen
        Random rndGen = new Random();

        // 2. Create a new instance of type Person named person with input "Mike", "Johnson"
        Person person = new Person("Mike", "Johnson");

        // 3. Create a new instance of type BookBag and bookbag with input person
        BookBag bookbag = new BookBag(person);

        // 4. Set the person's bookbag using the method setBookBag() and the bookbag instance you create in 3
        person.setBookBag(bookbag);
        System.out.println();

        //Step 7, 9 & 10

        Random random = new Random();

        // Create an array of phone numbers
        String[] phoneNumbers = new String[5];
        for (int i = 0; i < phoneNumbers.length; i++) {
            int areaCode = random.nextInt(900) + 100;
            int threeDigit = random.nextInt(900) + 100;
            int fourDigit = random.nextInt(9000) + 1000;
            phoneNumbers[i] = String.format("(%03d)-%03d-%04d", areaCode, threeDigit, fourDigit);
        }

        // Create five Phone instances with random prices and add them to the bookbag
        for (String phoneNumber : phoneNumbers) {
            Phone phones1 = new Phone(phoneNumber);
            bookbag.getItems().add(phones1);
        }
        bookbag.displayItems();
        System.out.println();

        String[] subjects = { "Math", "Chemistry", "Economics", "CS", "Physics", "History" };

        for (int i = 0; i < 4; i++) {
            String subject = subjects[random.nextInt(subjects.length)];
            double price = 50 + random.nextDouble() * (200 - 50);
            Book books = new Book(subject, price);
            bookbag.getItems().add(books);
        }
        bookbag.displayItems();
        System.out.println();

        //Step 11
        String[] colors = {"Red", "Black", "Green", "Blue"};
        PencilBag pencilBag = new PencilBag();

        for (int i = 0; i < 5; i++) {
            String color = colors[new Random().nextInt(colors.length)];
            double price = 1 + new Random().nextDouble() * (4 - 1);
            Pen pen1 = new Pen(color, price);
            pencilBag.getPens().add(pen1);
        }

        bookbag.getItems().add(pencilBag);
        bookbag.displayItems();
        System.out.println();

        //Step 13
        bookbag.displayItems();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total Price of Possessions");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("$%.2f", person.totalPriceOfPossessions());












    }//end of main
    public static void yourInfoHeader() {
        System.out.println("================================");
        System.out.println("PROGRAMMER:  " + "Roberto Callejas");
        System.out.println("PANTHER ID:  " + "6360177");
        System.out.println();
        System.out.println("CLASS \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U02C");
        System.out.println("SEMESTER: \t " + "Summer 2023");
        System.out.println("CLASS TIME: \t " + "10:00 AM - 12:50 PM");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 9");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================");
        System.out.println();
    }//end of yourInfoHeader


}//end of Controller
