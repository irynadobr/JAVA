package lesson5a;

import java.util.List;
import java.util.Objects;

public class Pet {
   private String namePet;


    public Pet() {
    }

    public Pet(String namePet) {
        this.namePet = namePet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(namePet, pet.namePet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePet);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "namePet='" + namePet + '\'' +
                '}';
    }
}
