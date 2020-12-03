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

    public void allBooks() {
        for (Books book : books) {
            System.out.println(book);
        }
    }

    public void addBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surName = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter age: ");
        String age =scanner.nextLine();
        Books newBbooks = new Books(name, surName, author, age);
        books.add(newBbooks);
        System.out.println(books);
    }

    public void searchNameAuthorBook() {
        Scanner searchNameAuthorBook = new Scanner(System.in);
        System.out.println("Введіть ім'я автора:");
        String scan = searchNameAuthorBook.nextLine();
        ArrayList<Books> bookNameAuthor = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getNameAutor().equals(scan)) {
                bookNameAuthor.add(book);
            } else {
            }
        }
        if (bookNameAuthor.size() == 0) {
            System.out.println("Немає такої книги");
        } else {
            System.out.println(bookNameAuthor);
        }
    }

    public void searchSurNameAuthorBook() {
        Scanner searchSurNameAuthorBook = new Scanner(System.in);
        System.out.println("Введіть прізвище автора:");
        String scan = searchSurNameAuthorBook.nextLine();
        ArrayList<Books> surNameAuthorBook = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getSurnameAutor().equals(scan)) {
                surNameAuthorBook.add(book);
            } else {
            }
        }
        if (surNameAuthorBook.size() == 0) {
            System.out.println("Немає такої книги");
        } else {
            System.out.println(surNameAuthorBook);
        }
    }

    public void searchNameBook() {
        Scanner searchNameBook = new Scanner(System.in);
        System.out.println("Введіть назву книги:");
        String scan = searchNameBook.nextLine();
        ArrayList<Books> nameBook = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getName().equals(scan)) {
                nameBook.add(book);
            } else {
            }
        }
        if (nameBook.size() == 0) {
            System.out.println("Немає такої книги:");

        } else {
            System.out.println(nameBook);
        }
    }

    public void searchAgeBook() {
        Scanner searchAgeBook = new Scanner(System.in);
        System.out.println("Введіть рік видання книги:");
        String scan = searchAgeBook.nextLine();
        ArrayList<Books> ageBook = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getAge().equals(scan)) {
                ageBook.add(book);
            } else {
            }
        }
        if (ageBook.size() == 0) {
            System.out.println("Немає такої книги:");
        } else {
            System.out.println(ageBook);
        }
    }

    public void exit() {
        System.out.println("Вихід");
    }
}
