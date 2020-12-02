package lesson2b;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Books> books;

    public Library() {
    }

    public Library(ArrayList books) {
        this.books = books;
    }

    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    public void AllBooks() {
        for (Books book : books) {
            System.out.println(book);
        }
    }

    public void AddBooks() {
        System.out.println("Додати книгу: ім'я автора книги, прізвище автора книги, назва книги, рік видання");
        Scanner name = new Scanner(System.in);
        Scanner surName = new Scanner(System.in);
        Scanner autor = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Books newBbooks = new Books(name.next(), surName.next(), autor.next(), age.next());
        books.add(newBbooks);
        System.out.println(books);
    }

    public void NameAutor() {
        Scanner nameAutor = new Scanner(System.in);
        System.out.println("Введіть ім'я автора:");
        String scan = nameAutor.next();
        ArrayList<Books> bookNameAutor = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getNameAutor().equals(scan)) {
                bookNameAutor.add(book);
            } else {
            }
        }
        if (bookNameAutor.size() == 0) {
            System.out.println("Немає такої книги");
        } else {
            System.out.println(bookNameAutor);
        }
    }

    public void surNameAutor() {
        Scanner surnameAutor = new Scanner(System.in);
        System.out.println("Введіть прізвище автора:");
        String scan = surnameAutor.next();
        ArrayList<Books> bookSurNameAutor = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getSurnameAutor().equals(scan)) {
                bookSurNameAutor.add(book);
            } else {
            }
        }
        if (bookSurNameAutor.size() == 0) {
            System.out.println("Немає такої книги");
        } else {
            System.out.println(bookSurNameAutor);
        }
    }

    public void Name() {
        Scanner name = new Scanner(System.in);
        System.out.println("Введіть назву книги:");
        String scan = name.nextLine();
        ArrayList<Books> bookName = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getName().equals(scan)) {
                bookName.add(book);
            } else {
            }
        }
        if (bookName.size() == 0) {
            System.out.println("Немає такої книги:");

        } else {
            System.out.println(bookName);
        }
    }

    public void Age() {
        Scanner age = new Scanner(System.in);
        System.out.println("Введіть рік видання книги:");
        String scan = age.next();
        ArrayList<Books> bookAge = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getAge().equals(scan)) {
                bookAge.add(book);
            } else {
            }
        }
        if (bookAge.size() == 0) {
            System.out.println("Немає такої книги:");
        } else {
            System.out.println(bookAge);
        }
    }

    public void Exit() {
        System.out.println("Вихід");
    }
}
