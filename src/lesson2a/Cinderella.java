package lesson2a;

public class Cinderella {
    private String name;
    private int age;
    private int footSize;

    public Cinderella() {
    }

    public Cinderella(String name, int age, int footSize) {
        this.name = name;
        this.age = age;
        this.footSize = footSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "Cinderella{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", footSize=" + footSize +
                '}';
    }
}
