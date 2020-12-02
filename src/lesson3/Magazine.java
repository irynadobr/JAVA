package lesson3;

import java.util.ArrayList;

public class Magazine implements Printable {
    private String nameMagazine;
    private int year;

    public Magazine(String nameMagazine, int year) {
        this.nameMagazine = nameMagazine;
        this.year = year;
    }

    public String getNameMagazine() {
        return nameMagazine;
    }

    public void setNameMagazine(String nameMagazine) {
        this.nameMagazine = nameMagazine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "nameMagazine='" + nameMagazine + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Name magazine is " + this.nameMagazine + ", year is " + this.year);
    }

    public static void printMagazines(Printable[] printable) {

        ArrayList<Printable> magazines = new ArrayList<>();
        for (Printable printables : printable) {
            if (printables instanceof Magazine) {
                magazines.add(printables);
            }
        }
        System.out.println(magazines);
    }
}
