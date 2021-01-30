//Створити якийсь файл і наповнити його якимось контентом (лорем іпсум чи якась стаття звідкись, не суть).
// Написати клас LineStorage, який матиме String поле. Написати клас ContentReader,
// який в потоці читатиме вміст файлу і записуватиме кожен рядок в LineStorage обєкт.
// Написати клас ContentPrinter, який в потоці виводитиме на екран вміст LineStorage.
// Синхронізувати потоки таким чином, щоб ContentPrinter не виводив один і той же ж рядок декілька разів.
//

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
