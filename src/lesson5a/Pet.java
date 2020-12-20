package lesson5a;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Pet {
    private int idPet;
    private String namePet;
    private int age;



    public Pet() {
    }

    public Pet(int idPet, String namePet, int age) {
        this.idPet = idPet;
        this.namePet = namePet;
        this.age = age;

    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return idPet == pet.idPet &&
                age == pet.age &&
                Objects.equals(namePet, pet.namePet);

    }

    @Override
    public int hashCode() {
        return Objects.hash(idPet, namePet, age);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "idPet=" + idPet +
                ", namePet='" + namePet + '\'' +
                ", age=" + age +
                '}';
    }
}