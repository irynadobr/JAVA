package lesson4;

public class Dress extends Clothes implements ClothesWomen {


    public Dress(ClothesSize clothesSize, String color, double cena, Sex sex) {
        super(clothesSize, color, cena, sex);
    }

    @Override
    public String toString() {
        return "Dress{} " + super.toString();
    }

    @Override
    public void DressWomen() {
        System.out.println("dress: " + "cena = " + super.getCena() + "   euroSize = " + super.getClothesSize() + "   color - " + super.getColor());
    }
}

