

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(birthday, person.birthday) &&
                Objects.equals(books, person.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, age, books);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", books=" + books +
                '}';
    }
}
