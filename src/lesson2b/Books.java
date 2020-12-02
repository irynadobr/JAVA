package lesson2b;

import java.util.Objects;

public class Books {
    private String nameAutor;
    private String surnameAutor;
    private String name;
    private String age;

    public Books() {
    }

    public Books(String nameAutor, String surnameAutor, String name, String age) {
        this.nameAutor = nameAutor;
        this.surnameAutor = surnameAutor;
        this.name = name;
        this.age = age;
    }

    public String getNameAutor() {
        return nameAutor;
    }

    public void setNameAutor(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    public String getSurnameAutor() {
        return surnameAutor;
    }

    public void setSurnameAutor(String surnameAutor) {
        this.surnameAutor = surnameAutor;
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
                "nameAutor='" + nameAutor + '\'' +
                ", surnameAutor='" + surnameAutor + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return Objects.equals(nameAutor, books.nameAutor) &&
                Objects.equals(surnameAutor, books.surnameAutor) &&
                Objects.equals(name, books.name) &&
                Objects.equals(age, books.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAutor, surnameAutor, name, age);
    }
}