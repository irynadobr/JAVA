//Якщо у вас зооклуб, з Person (id, name, age, birthdate, city) i Pet (id, кличка, вид тварини,...)
// створити файл:
//
//        1. Petro, 24, 12-12-1996, Lviv. Pets:
//        1. Tuzik, dog;
//        2. Murka, cat;
//        2. Ira, 18, 05-04-2002, Kyiv: Pets:
//        3. Pikachu, fish;
//        4. Kakashka, turtle;
//        ...
//        Наповнюєте файл відповідно певному формату і згідно з цього формату пишете метод,
//        який розпарсить дані з файлу і створить відповідних Person i Pet
import java.io.*;
import java.util.*;

public class Start {
    public static void main(String[] args) {

        File file = new File("zooclub.txt");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            String s = "1, Igor, 22, Lviv, Pets:1, собака, 1; 2, кіт, 2; 3, папуга, 5" + "\r\n" +
                    "2, Oleg, 25, Odesa, Pets:1, собака, 5; 2, морська свинка, 3" + "\r\n" +
                    "3, Olga, 30, Lviv, Pets:1, собака, 10; 2, кіт, 5; 3, морська свинка, 1";
            fileOutputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("zooclub.txt"))) {
            ZooClub zooClub = new ZooClub();
            Map<Person, List<Pet>> club = zooClub.getClub();
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                List<Pet> pets = new ArrayList<>();
                String[] words1 = s.split(", Pets:");
                for (String word : words1) {
                    String[] words2 = word.split("; ");
                    for (String word2 : words2) {
                        String[] words3 = word2.split(", ");
                        if (words2.length > 1) {
                            pets.add(new Pet(Integer.parseInt(words3[0].trim()), words3[1], Integer.parseInt(words3[2].trim())));
                        } else {
                            Person person = new Person(Integer.parseInt(words3[0].trim()), words3[1], Integer.parseInt(words3[2].trim()), words3[3]);
                            club.put(person, pets);
                        }
                    }
                }
            }
               System.out.println(club);

                boolean choice = true;
                while (choice) {
                    zooClub.menu();

                    switch (zooClub.scannerInt("зробіть свій вибір: ")) {
                        case 1:
                            zooClub.addPerson();
                            break;
                        case 2:
                            //додати тваринку до учасника клубу по  person:
                            zooClub.addPetPerson();
                            //додати тваринку до учасника клубу по id person:
                            zooClub.addPetPersonId();
                            break;
                        case 3:

                            zooClub.removePetWithPerson();

                            break;
                        case 4:

                            zooClub.removePerson();
                            break;
                        case 5:
                            zooClub.removePetAllPerson(club);

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
            catch(
                    IOException e){
                e.printStackTrace();
            }

        }
    }
