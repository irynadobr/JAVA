//Створити якийсь файл і наповнити його якимось контентом (лорем іпсум чи якась стаття звідкись, не суть).
// Написати клас LineStorage, який матиме String поле. Написати клас ContentReader,
// який в потоці читатиме вміст файлу і записуватиме кожен рядок в LineStorage обєкт.
// Написати клас ContentPrinter, який в потоці виводитиме на екран вміст LineStorage.
// Синхронізувати потоки таким чином, щоб ContentPrinter не виводив один і той же ж рядок декілька разів.
//
//        Додаткові завдання
//        1. Переписати ContentPrinter так, щоб він не тільки виводив на консоль, а й переписував текст в інший файл.
//        2. Створити ще один клас, WordWriter, який буде в потоці парсити рядок тексту з LineStorage,
//        розбивати його на окремі слова і записувати їх в ще інший файл
//
//        Підказки:
//        1. Тут крім synchonized треба буде ще монітор заюзати (методи wait i notify з Object)
//        2. В неті є схожий приклад - https://coderanch.com/t/454912/certification/Multithread-program-khalid-mughal

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        LineStorage lineStorage = new LineStorage();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"));
        ContenReader contenReader = new ContenReader(lineStorage, bufferedReader);
        ContenPrinter contenPrinter = new ContenPrinter(lineStorage);

        new Thread(contenPrinter).start();
        new Thread(contenReader).start();
    }
}
