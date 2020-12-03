package lesson2b;

import java.util.Objects;

public class Books {
    private String nameAuthor;
    private String surnameAuthor;
    private String name;
    private String age;

    public Books() {
    }

    public Books(String nameAutor, String surnameAutor, String name, String age) {
        this.nameAuthor = nameAutor;
        this.surnameAuthor = surnameAutor;
        this.name = name;
        this.age = age;
    }

    public String getNameAutor() {
        return nameAuthor;
    }

    public void setNameAutor(String nameAutor) {
        this.nameAuthor = nameAutor;
    }

    public String getSurnameAutor() {
        return surnameAuthor;
    }

    public void setSurnameAutor(String surnameAutor) {
        this.surnameAuthor = surnameAutor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Books{" +
                "nameAutor='" + nameAuthor + '\'' +
                ", surnameAutor='" + surnameAuthor + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(nameAuthor, books.nameAuthor) &&
                Objects.equals(surnameAuthor, books.surnameAuthor) &&
                Objects.equals(name, books.name) &&
                Objects.equals(age, books.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor, name, age);
    }
}