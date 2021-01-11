

import java.util.Objects;

public class Book {
    private String nameBook;
    private int numberOfPages;

    public Book() {
    }

    public Book(String nameBook, int numberOfPages) {
        this.nameBook = nameBook;
        this.numberOfPages = numberOfPages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, numberOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
