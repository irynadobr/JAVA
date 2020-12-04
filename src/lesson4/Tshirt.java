package lesson4;

public class Tshirt extends Clothes implements ClothesMen, ClothesWomen {


    public Tshirt(ClothesSize clothesSize, String color, double cena, Sex sex) {
        super(clothesSize, color, cena, sex);
    }

    @Override
    public String toString() {
        return "Tshirt{} " + super.toString();
    }

    @Override
    public void DressMen() {
        System.out.println("t-shirt men: " + "cena = " + "cena = " + super.getCena() + "   euroSize = " + super.getClothesSize() + "   color - " + super.getColor());
    }

    @Override
    public void DressWomen() {
        System.out.println("t-shirt woman: " + "cena = " + "cena = " + super.getCena() + "   euroSize = " + super.getClothesSize() + "   color - " + super.getColor());
    }
}
