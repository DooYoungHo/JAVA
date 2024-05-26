package run;

import bike.Bike;
import book.Book;
import point.Point;

public class Run {

    public static void main(String[] args) {

        Bike hondai = new Bike();
        Bike ducati = new Bike();

        hondai.stepOnAccel();
        hondai.stepOnBreak();

        ducati.stepOnAccel();
        ducati.stepOnBreak();

        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        String book1 = "artOfComputerProgramming";
        String book2 = "effectiveJava";
        String book3 = "cleanCode";

        Book newBook1 = new Book(book1);
        Book newBook2 = new Book(book2);
        Book newBook3 = new Book(book3);

        newBook1.setNumOfCopies(100);
        newBook1.increaseNumOfCopies(100);
        newBook1.decreaseNumOfCopies(30);
        System.out.println(newBook1.getNumOfCopies());

        newBook2.setNumOfCopies(250);
        newBook2.increaseNumOfCopies(250);
        newBook2.decreaseNumOfCopies(500);
        System.out.println(newBook2.getNumOfCopies());

        newBook3.setNumOfCopies(20);
        newBook3.increaseNumOfCopies(0);
        newBook3.decreaseNumOfCopies(30);
        System.out.println(newBook3.getNumOfCopies());

        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        p1.move(1,1);
        System.out.println(p1.getX() + ", " + p1.getY());

        System.out.println(p1.distanceTo(p2));
    }
}
