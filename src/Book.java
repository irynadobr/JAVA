import lombok.*;


@Data
public class Book {
    private String nameBook;
    private int numberOfPages;

    public Book() {
    }

    public Book(String nameBook, int numberOfPages) {
        this.nameBook = nameBook;
        this.numberOfPages = numberOfPages;
    }


    }

