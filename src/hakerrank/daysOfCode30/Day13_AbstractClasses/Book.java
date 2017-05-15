package hakerrank.daysOfCode30.Day13_AbstractClasses;


abstract class Book {
    String title;
    String author;


    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
