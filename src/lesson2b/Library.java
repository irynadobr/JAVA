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
        System.out.println("Додати книгу: ім'я автора книги, прізвище автора книги, назва книги, рік видання");
        Scanner name = new Scanner(System.in);
        Scanner surName = new Scanner(System.in);
        Scanner autor = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Books newBbooks = new Books(name.nextLine(), surName.nextLine(), autor.nextLine(), age.nextLine());
        books.add(newBbooks);
        System.out.println(books);
    }

    public void searchNameAutorBook() {
        Scanner searchNameAutorBook = new Scanner(System.in);
        System.out.println("Введіть ім'я автора:");
        String scan = searchNameAutorBook.nextLine();
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

    public void searchSurNameAutorBook() {
        Scanner searchSurNameAutorBook = new Scanner(System.in);
        System.out.println("Введіть прізвище автора:");
        String scan = searchSurNameAutorBook.nextLine();
        ArrayList<Books> surNameAutorBook = new ArrayList<Books>();
        for (Books book : books) {
            if (book.getSurnameAutor().equals(scan)) {
                surNameAutorBook.add(book);
            } else {
            }
        }
        if (surNameAutorBook.size() == 0) {
            System.out.println("Немає такої книги");
        } else {
            System.out.println(surNameAutorBook);
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
