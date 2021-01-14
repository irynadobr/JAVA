//В плані домашнього: щоб не вигадувати всяке різне, просто пройдіться по ВСІХ операціях стріма,
// бажано по декілька разів.
//        Особливо спробуйте  flatMap i collect(toMap(...)), декілька завдань внизую
//        Придумайте щось з ускладнених завдань, працюючи з List<Person>,
//        кожен з об'єктів якого має List<Book>, наприклад:
//        1. згенерувати мапу <Person, Integer>, де Integer - кількість сторінок усіх книжок, які має людина
//        2. згенерувати мапу <String, Book>, де String - ім'я людини,
//        Book - книжка з найбільшою кількістю сторінок
//        3. згенерувати List<Book> відфільтрувавши тільких тих людей,
//        хто старше 25 років і книжки які мають більше 500 сторінок

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Start {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Ira", LocalDate.of(1998, 3, 1), 22, Arrays
                        .asList(new Book("Java", 500), new Book("Piton", 200))),
                new Person("Oleg", LocalDate.of(1980, 5, 2), 40, Arrays
                        .asList(new Book("Java", 200), new Book("Piton", 300), new Book("Faraon", 350))),
                new Person("Igor", LocalDate.of(1985, 6, 5), 35, Arrays
                        .asList(new Book("Java", 500), new Book("Garry Potter", 600), new Book("English", 420))),
                new Person("Vasil", LocalDate.of(1990, 7, 2), 30, Arrays
                        .asList(new Book("Piton", 300), new Book("Read and speak", 209))));

        //       1. згенерувати мапу <Person, Integer>, де Integer - кількість сторінок усіх книжок, які має людина

        Map<Person, Integer> personIntegerMap = persons.stream()
                .collect(Collectors.toMap(person -> person,
                        person -> person.getBooks().stream()
                                .mapToInt(Book::getNumberOfPages)
                                .reduce(0, Integer::sum)));
        personIntegerMap.forEach((k, v) -> System.out.println(k + " " + "\r\n" + "Кількість сторінок усіх книжок, які має " + k.getName() + " дорівнює: " + v));

//        2. згенерувати мапу <String, Book>, де String - ім'я людини,
//        Book - книжка з найбільшою кількістю сторінок


        Map<String, Book> stringBookMap = persons.stream()
                .collect(Collectors.toMap(person -> person.getName(),
                        person -> person.getBooks().stream()
                                .max((b1, b2) -> b1.getNumberOfPages() - b2.getNumberOfPages())
                                .get()));

        stringBookMap.forEach((x, y) -> System.out.println(x + ", " + y.getNameBook()
                + "- книжка, у якої найбільша кількість сторінок: " + "\r\n" + y));
//or
        Map<String, Book> stringBookMap1 = persons.stream()
                .collect(Collectors.toMap(person -> person.getName(),
                        person -> person.getBooks().stream()
                                .sorted((b1, b2) -> b2.getNumberOfPages() - b1.getNumberOfPages())
                                .findFirst()
                                .get()));
        stringBookMap1.forEach((x, y) -> System.out.println(x + ", " + y.getNameBook()
                + "- книжка, у якої найбільша кількість сторінок: " + "\r\n" + y));

        //        3. згенерувати List<Book> відфільтрувавши тільких тих людей,
//        хто старше 25 років і книжки які мають більше 500 сторінок

        List<Book> bookList = persons.stream()
                .filter(person -> person.getAge() > 25)
                .map(person -> person.getBooks())
                .flatMap(books -> books.stream())
                .filter(book -> book.getNumberOfPages() > 500)
                .collect(Collectors.toList());
        bookList.forEach(System.out::println);

        //Додаткові:
        //1. Згенерувати List<Person>, які народились у 1990 році і збільшити їх дату народження на 10 років

        List<Person> personList = persons.stream()
                .filter(person -> person.getBirthday().getYear() == 1990).
                        peek(person -> person.setBirthday(LocalDate.of
                                (person.getBirthday().getYear() + 10
                                        , person.getBirthday().getMonth()
                                        , person.getBirthday().getDayOfMonth())))
                .collect(Collectors.toList());
        personList.forEach(System.out::println);


        //2. Згенерувати map <Person,Integer>, де  у person зменшити вік на 5 років, integer -загальна кількість книжок, які має людина

        Map<Person, Integer> personIntegerMap1 = persons.stream()
                .peek(person -> person.setAge(person.getAge() - 5))
                .collect(Collectors.toMap(person -> person,
                        person -> person.getBooks().size()));

        personIntegerMap1.forEach((k, v) ->
                System.out.println(k + "\r\n" + "загальна кількість книжок, які має " + k.getName() + ", дорівнює: " + v));

        //3. Згенерувати map List<Person>, де Person- люди, у яких є книжка за назвою "Java"/


        List<Person> people = persons.stream()
                .filter(person -> person.getBooks().stream()
                        .anyMatch(book -> "Java".equals(book.getNameBook())))
                .collect(Collectors.toList());
        people.forEach((k) ->
                System.out.println(k + "\r\n" + k.getName() + " має книжку за назвою Java"));


        //or Згенерувати стрічку person, у яких є книжка "Java"

    String people2 = persons.stream()
                .filter(person -> person.getBooks().stream()
                        .anyMatch(book -> "Java".equals(book.getNameBook())))
            .map(person -> person.getName())
            .reduce((s1,s2)->s1+","+s2).get();


System.out.println(people2+ " мають книжку за назвою Java");




    }
}
