package lesson3;

public class Start {
    public static void main(String[] args) {
        Printable printable1 = new Book("Java", "Bert Beyts");
        Printable printable2 = new Magazine("Moda", 2018);
        Printable printable3 = new Book("JS", "Golovatiy");
        Printable printable4 = new Magazine("Health", 2019);
        Printable printable5 = new Book("Python", "Kerol Vorderman");
        Printable printable6 = new Magazine("Zog", 2017);
        Printable printable7 = new Magazine("Model", 2015);

        Printable[] printable = new Printable[7];
        printable[0] = printable1;
        printable[1] = printable2;
        printable[2] = printable3;
        printable[3] = printable4;
        printable[4] = printable5;
        printable[5] = printable6;
        printable[6] = printable7;
        for (Printable printables : printable)
            printables.print();

        Magazine.printMagazines(printable);
        Book.printBook(printable);


    }
}
