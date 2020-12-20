//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В мейн методі створити меню, яке буде реалізовувати наступні функції:
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.

package lesson5a;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet(1, "собака", 1));
        pets.add(new Pet(2, "кіт", 2));
        pets.add(new Pet(3, "папуга", 5));
        pets.add(new Pet(4, "морська свинка", 2));
        Person person = new Person(1, "Igor", 20, "Lviv");
        Map<Person, List<Pet>> club = zooClub.getClub();
        club.put(person, pets);
        boolean choice = true;
        while (choice) {
            zooClub.menu();

            switch (zooClub.scannerInt("зробіть свій вибір: ")) {
                case 1:
                    zooClub.addPerson(new Person(2, "Oleg", 25, "Lviv"));
                    break;
                case 2:
                    //додати тваринку до учасника клубу по  person:
                    zooClub.addPetPerson(new Person(2, "Oleg", 25, "Lviv"),
                            new Pet(1, "кіт", 3));
                    //додати тваринку до учасника клубу по id person:
                    zooClub.addPetPersonId(3, new Pet(2, "pes", 2));
                    break;
                case 3:

                    zooClub.removePetWithPerson(new Person(1, "Igor", 20, "Lviv"),
                            new Pet(3, "папуга", 5));

                    break;
                case 4:

                    zooClub.removePerson(new Person(2, "Oleg", 25, "Lviv"));
                    break;
                case 5:
                    zooClub.removePetAllPerson("кіт", club);

                    break;
                case 6:
                    zooClub.printZooClub(club);
                    break;
                case 7:

                    choice = false;
                    break;

                default:
                    System.out.println("Введено не коректний номер, зробіть свій вибір ще раз: ");
                    break;
            }
        }


    }
}







