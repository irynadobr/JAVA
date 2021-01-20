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
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) {


        File file = new File("zooclub.txt");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file)){
            String s ="1, Igor, 22, Lviv" +"\r\n"+
                    "Pets:" +"\r\n"+
                    "1, собака, 1" +"\r\n"+
                    "2, кіт, 2 " +"\r\n"+
                    "3, папуга, 5"+"\r\n"+
                    "2, Oleg, 25, Odesa" +"\r\n"+
                    "Pets:" +"\r\n"+
                    "1, собака, 5" +"\r\n"+
                    "2, морська свинка, 3" +"\r\n"+
                    "3, Olga, 30, Lviv" +"\r\n"+
                    "Pets: " +"\r\n"+
                    "1, собака, 10" +"\r\n"+
                    "2, кіт, 5"+"\r\n"+
                    "3, морська свинка, 1";
            fileOutputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                BufferedReader bufferedReader=new BufferedReader(new FileReader("zooclub.txt"))){

            String s1;
        //    while ((s1=bufferedReader.readLine())!=null) {
                String[] words = bufferedReader.readLine().split(", ");
                Person person = new Person(Integer.parseInt(words[0].trim()),words[1],Integer.parseInt(words[2].trim()),words[3]);
            System.out.println(person);
             bufferedReader.readLine();
            String[] wordsPets = bufferedReader.readLine().split(", ");
            int idPet=Integer.parseInt(wordsPets[0].trim());
            String namePet=wordsPets[1];
            int agePet=Integer.parseInt(wordsPets[2].trim());
             Pet pet = new Pet(idPet,namePet, agePet);
            System.out.println(pet);
            String[] wordsPets1 = bufferedReader.readLine().split(", ");
            Pet pet1 = new Pet(Integer.parseInt(wordsPets1[0].trim()),wordsPets1[1], Integer.parseInt(wordsPets1[2].trim()));
            System.out.println(pet1);
            String[] wordsPets2 = bufferedReader.readLine().split(", ");
            Pet pets2 = new Pet(Integer.parseInt(wordsPets2[0].trim()),wordsPets2[1], Integer.parseInt(wordsPets2[2].trim()));
            System.out.println(pets2);
            String[] words2 = bufferedReader.readLine().split(", ");
            Person person2 = new Person(Integer.parseInt(words2[0].trim()),words2[1],Integer.parseInt(words2[2].trim()),words2[3]);
            System.out.println(person2);
            bufferedReader.readLine();
            String[] wordsPets3 = bufferedReader.readLine().split(", ");
            Pet pets3 = new Pet(Integer.parseInt(wordsPets3[0].trim()),wordsPets3[1], Integer.parseInt(wordsPets3[2].trim()));
            System.out.println(pets3);
            String[] wordsPets4 = bufferedReader.readLine().split(", ");
            Pet pets4 = new Pet(Integer.parseInt(wordsPets4[0].trim()),wordsPets4[1], Integer.parseInt(wordsPets4[2].trim()));
            System.out.println(pets4);
            String[] words3 = bufferedReader.readLine().split(", ");
            Person person3 = new Person(Integer.parseInt(words3[0].trim()),words3[1],Integer.parseInt(words3[2].trim()),words3[3]);
            System.out.println(person3);
            bufferedReader.readLine();
            String[] wordsPets5 = bufferedReader.readLine().split(", ");
            Pet pets5 = new Pet(Integer.parseInt(wordsPets5[0].trim()),wordsPets5[1], Integer.parseInt(wordsPets5[2].trim()));
            System.out.println(pets5);
            String[] wordsPets6 = bufferedReader.readLine().split(", ");
            Pet pets6 = new Pet(Integer.parseInt(wordsPets6[0].trim()),wordsPets6[1], Integer.parseInt(wordsPets6[2].trim()));
            System.out.println(pets6);
            String[] wordsPets7 = bufferedReader.readLine().split(", ");
            Pet pets7 = new Pet(Integer.parseInt(wordsPets7[0].trim()),wordsPets7[1], Integer.parseInt(wordsPets7[2].trim()));
            System.out.println(pets7);

         //   }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

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
}
