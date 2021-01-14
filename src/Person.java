import lombok.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Data
public class Person {

    private String name;
    private LocalDate  birthday;
    private int age;
    private List<Book>books= Arrays.asList();

    public Person() {
    }

    public Person(String name, LocalDate birthday, int age, List<Book> books) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.books = books;
    }



}
