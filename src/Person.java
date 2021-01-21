
import java.util.Objects;
public class Person  {

    private int idPerson;
    private String namePerson;
    private int age;
    private String city;

    public Person() {
    }

    public Person(int idPerson, String namePerson, int age, String city) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.age = age;
        this.city = city;

    }


    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return idPerson == person.idPerson &&
                age == person.age &&
                Objects.equals(namePerson, person.namePerson) &&
                Objects.equals(city, person.city);

    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson, namePerson, age, city);
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", namePerson='" + namePerson + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +

                '}';
    }
}
