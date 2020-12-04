package lesson4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Clothes> clothes = new ArrayList<>();

        clothes.add(new Tie(ClothesSize.S, "black", 1200, Sex.men));
        clothes.add(new Tie(ClothesSize.XS, "wite", 200, Sex.men));
        clothes.add(new Tie(ClothesSize.M, "wite", 100, Sex.men));
        clothes.add(new Dress(ClothesSize.L, "red", 50000, Sex.women));
        clothes.add(new Dress(ClothesSize.XXS, "yellow", 12000, Sex.women));
        clothes.add(new Trousers(ClothesSize.XXS, "white", 7500, Sex.men));
        clothes.add(new Trousers(ClothesSize.L, "green", 9500, Sex.women));
        clothes.add(new Tshirt(ClothesSize.XXS, "red", 5000, Sex.men));
        clothes.add(new Tshirt(ClothesSize.M, "green", 15000, Sex.women));

        Atelier atelier = new Atelier(clothes);

        System.out.println((atelier.womenChoice()));
        System.out.println((atelier.menChoice()));


    }
}
