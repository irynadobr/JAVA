package lesson5a;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();


    public ZooClub() {
    }

    public ZooClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooClub zooClub = (ZooClub) o;
        return Objects.equals(club, zooClub.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(club);
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }

    public void menu() {
        System.out.println("1) додати учасника в клуб");
        System.out.println("2) додати тваринку до учасника клубу");
        System.out.println("3) видалити тваринку з власника");
        System.out.println("4) видалити учасника клубу");
        System.out.println("5) видалити конкретну тваринку з усіх власників");
        System.out.println("6) вивести на екран зооклуб");
        System.out.println("7) вихід");
    }


    public int scannerInt(String enter) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(enter);
        int sk = scanner.nextInt();
        return sk;
    }

//1) додати учасника в клуб
    public void addPerson(Person person) {
        club.put(person, new ArrayList<>());
        System.out.println(" В зооклуб додано: " + person);
        printZooClub(club);
    }
//1) додати учасника в клуб по id person
    public void addPetPersonId(int idPerson, Pet pet) {
        Set<Person> persons = club.keySet();
        List<Person> personClub = new ArrayList<>();
        for (Person person : persons) {
            if (club.containsKey(person)) {
                if (person.getIdPerson() == idPerson) {
                    club.get(person).add(pet);
                    System.out.println("До власника " + person.getNamePerson() + " з id: " + idPerson + " додано тваринку " + ": " + pet);
                    personClub.add(person);
                }
            }
        }
        if (personClub.isEmpty()) {
            System.out.println("person з id: " + idPerson + " -  не є учасником клубу");
        }
        printZooClub(club);
    }
//2) додати тваринку до учасника клубу
    public void addPetPerson(Person person, Pet pet) {
        if (club.containsKey(person)) {
            club.get(person).add(pet);
            System.out.println("До власника " + person + " додано тваринку " + ": " + pet);
            printZooClub(club);
        } else {
            System.out.println("Такий person -  не є учасником клубу");
        }
    }
//3) видалити тваринку з власника
    public void removePetWithPerson(Person person, Pet pet) {
        if (club.containsKey(person)) {
            if (club.get(person).contains(pet)) {
                club.get(person).remove(pet);
                System.out.println("З власника " + person + " видалено тваринку " + ": " + pet);
            } else {
                System.out.println("У власника " + person + " не має тваринки " + ": " + pet);
            }
        } else {
            System.out.println("Такий person -  не є учасником клубу");
        }
        printZooClub(club);
    }
//4) видалити учасника клубу
    public void removePerson(Person person) {
        if (club.containsKey(person)) {
            club.remove(person);
            System.out.println("З зооклубу видалено:  " + person);
            printZooClub(club);
        } else {
            System.out.println(person.getNamePerson() + "-  не є учасником клубу");
        }
    }
//5) видалити конкретну тваринку з усіх власників
    public void removePetAllPerson(String namePet, Map<Person, List<Pet>> club) {
        if (club.isEmpty()) {
            System.out.println("В zooklub немає учасників");
            return;
        }
        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
        for (Map.Entry<Person, List<Pet>> entry : entries) {
            System.out.println("person - " + entry.getKey() + ": ");
            List<Person> keys = new ArrayList<>();
            Iterator<Pet> iterator = entry.getValue().iterator();
            while (iterator.hasNext()) {
                Pet pet = iterator.next();
                if (club.get(entry.getKey()).contains(pet) && pet.getNamePet().equals(namePet)) {
                    iterator.remove();
                    System.out.println("З власника " + entry.getKey().getNamePerson() + " видалено тваринку " + pet.getNamePet());
                    keys.add(entry.getKey());
                }
            }
            if (keys.isEmpty()) {
                System.out.println(entry.getKey().getNamePerson() + " не має тваринки - " + namePet);
            }
        }
        printZooClub(club);
    }

//6) вивести на екран зооклуб
    public void printZooClub(Map<Person, List<Pet>> club) {
        if (club.isEmpty()) {
            System.out.println("В zooklub немає учасників");
        }
        System.out.println("Зооклуб: ");
        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
        for (Map.Entry<Person, List<Pet>> entry : entries) {
            System.out.println(entry.getKey() + ": ");
            for (Pet pet : entry.getValue()) {
                System.out.println("\t" + pet);
            }
        }
    }

}