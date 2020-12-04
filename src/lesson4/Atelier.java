package lesson4;

import java.util.ArrayList;


public class Atelier {
    private ArrayList<Clothes> clothes;

    public Atelier() {
    }

    public Atelier(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + clothes +
                '}';
    }

    public ArrayList<Clothes> womenChoice() {
        System.out.println("womenChoice:");
        ArrayList<Clothes> dressWomen = new ArrayList<>();
        for (Clothes clothe : clothes) {
            if ((clothe instanceof ClothesWomen) && (clothe.getSex().equals(Sex.women))) {
                dressWomen.add(clothe);
              //  System.out.println(clothe);

            }

        }
        return dressWomen;
    }

    public ArrayList<Clothes> menChoice() {
        System.out.println("menChoice: ");
        ArrayList<Clothes> dressMen = new ArrayList<>();
        for (Clothes clothe : clothes) {
            if ((clothe instanceof ClothesMen) && (clothe.getSex().equals(Sex.men))) {
                dressMen.add(clothe);
               // System.out.println(clothe);
            }

        }
        return dressMen;
    }
}