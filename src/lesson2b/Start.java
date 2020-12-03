//
//        Books[] array = {new Books("Тарас Шевченко", "Кобзар", "1860г.")};
//
//
//        System.out.println("Меню");
//        System.out.println("1. Вывести все книги");
//        System.out.println("2. Добовить книгу");
//        System.out.println("3. Поиск по имени автора");
//        System.out.println("4. Поиск по фамилии автора");
//        System.out.println("5. Поиск по названию книги");
//        System.out.println("6. Поиск по году");
//        System.out.println("9. Выход");
//        System.out.print("Сделайте выбор: ");

package lesson2b;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        ArrayList<Books> books = new ArrayList<>();
        books.add(new Books("Тарас", "Шевченко", "Кобзар", "1860"));
        books.add(new Books("Леся", "Українка", "Поетичні твори", "1981"));
        books.add(new Books("Генрік", "Сінкевич", "Куда ідеш", "1989"));
        books.add(new Books("Тарас", "Шевченко", "Кобзар", "1972"));

        Library library = new Library(books);

        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("Меню:");
            System.out.println("1. Вивести всі книги");
            System.out.println("2. Додати книгу");
            System.out.println("3. Пoшук по імені автора");
            System.out.println("4. Пошук по прізвищу автора");
            System.out.println("5. Пошук по назві книги");
            System.out.println("6. Пошук по року видання");
            System.out.println("7. Вихід");
            System.out.print("Зробіть вибір: ");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    library.allBooks();
                    break;
                case 2:
                    library.addBooks();
                    break;
                case 3:
                    library.searchNameAuthorBook();
                    break;
                case 4:
                    library.searchSurNameAuthorBook();
                    break;
                case 5:
                    library.searchNameBook();
                    break;
                case 6:
                    library.searchAgeBook();
                    break;
                case 7:
                    library.exit();
                    check = false;

                    break;
                default:
                    break;
            }
        }
    }
}
