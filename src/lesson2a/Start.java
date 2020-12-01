package lesson2a;

import java.util.ArrayList;

//        Створити класс попелющка ім'я вік розмір ноги
//        створити кілька попелюшок, покласти їх в масив
//        Створити класс принц  з полем туфелька
//        створити 1 об'єкт принца в якого э туфелька певного розміру
//        знайти яка попелюшок повинна бути з принцом
public class Start {
    public static void main(String[] args) {

        Cinderella cinderella1 = new Cinderella("Olga", 22, 39);
        Cinderella cinderella2 = new Cinderella("Anna", 20, 38);
        Cinderella cinderella3 = new Cinderella("Alina", 25, 40);
        Cinderella cinderella4 = new Cinderella("Olena", 19, 38);
        Cinderella cinderella5 = new Cinderella("Karina", 21, 37);
        Cinderella cinderella6 = new Cinderella("Natali", 18, 38);
        Cinderella cinderella7 = new Cinderella("Mari", 16, 34);

        Prince prince = new Prince(34);

        ArrayList<Cinderella> cinderellas = new ArrayList<>();
        cinderellas.add(cinderella1);
        cinderellas.add(cinderella2);
        cinderellas.add(cinderella3);
        cinderellas.add(cinderella4);
        cinderellas.add(cinderella5);
        cinderellas.add(cinderella6);
        cinderellas.add(cinderella7);

       for (Cinderella cinderella : cinderellas) {
            if (cinderella.getFootSize() == prince.getShoe()) {

                System.out.println(cinderella.getName() + " - попелюшка, повинна бути з принцем");
            } else {

                System.out.println(cinderella.getName() + " - не є попелюшкою, яка повинна бути з принцем");
            }
        }
    }
}
