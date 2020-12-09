package lesson5a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("собака"));
        pets.add(new Pet("кіт"));
        pets.add(new Pet("папуга"));
        pets.add(new Pet("морська свинка"));
   Person person1 = new Person("Aleks");
   Person person2 = new Person("Oleg");
        Map<Person, List <Pet>> club= new LinkedHashMap<>();


        System.out.println("додати учасника в клуб");
        System.out.println("додати додати тваринку до учасника клубу");
        System.out.println("видалити тваринку з власника");
        System.out.println("видалити учасника клубу");
        System.out.println("видалити конкретну тваринку з усіх власників");
        System.out.println("вивести на екран зооклуб");



    }
}
