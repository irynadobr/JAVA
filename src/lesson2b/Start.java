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

        Books books1 = new Books("Тарас", "Шевченко", "Кобзар", "1860");
        Books books2 = new Books("Леся", "Українка", "Поетичні твори", "1981");
        Books books3 = new Books("Генрік", "Сінкевич", "Куда ідеш", "1989");
        Books books4 = new Books("Тарас", "Шевченко", "Кобзар", "1972");

        ArrayList<Books> books = new ArrayList<>();
        books.add(books1);
        books.add(books2);
        books.add(books3);
        books.add(books4);

        Library library = new Library(books);

        Scanner sc = new Scanner(System.in);
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
                library.AllBooks();
                break;
            case 2:
                library.AddBooks();
                break;
            case 3:
                library.NameAutor();
                break;
            case 4:
                library.surNameAutor();
                break;
            case 5:
                library.Name();
                break;
            case 6:
                library.Age();
                break;
            case 7:
                library.Exit();
                break;
            default:
                break;
        }
    }
}
