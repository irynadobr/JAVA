package lesson3;

import java.util.ArrayList;

public class Book implements Printable {

    private String nameBook;
    private String authorBook;

    public Book(String nameBook, String authorBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Name book is " + this.nameBook + ", authorBook is " + this.authorBook);
    }

    public static void printBook(Printable[] printable) {
        ArrayList<Printable> books = new ArrayList<>();
        for (Printable printables : printable) {
            if (printables instanceof Book) {
                books.add(printables);
            }
        }
        System.out.println(books);
    }
}

