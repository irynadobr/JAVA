//а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.
//        д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//        е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
//        который выводит на консоль названия только журналов.
//        Создать статический метод printBooks(Printable[] printable) в классе Book,
//        который выводит на консоль названия только книг. Используем оператор instanceof.

package lesson3;


public class Start {
    public static void main(String[] args) {

        Printable[] printable = new Printable[7];
        printable[0] = new Book("Java", "Bert Beyts");
        printable[1] = new Magazine("Moda", 2018);
        printable[2] = new Book("JS", "Golovatiy");
        printable[3] = new Magazine("Health", 2019);
        printable[4] = new Book("Python", "Kerol Vorderman");
        printable[5] = new Magazine("Zog", 2017);
        printable[6] = new Magazine("Model", 2015);

        for (Printable printables : printable)
            printables.print();

        Magazine.printMagazines(printable);
        Book.printBook(printable);


    }
}
