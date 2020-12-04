package lesson4;

public class Tie extends Clothes implements ClothesMen {

    public Tie(ClothesSize clothesSize, String color, double cena, Sex sex) {
        super(clothesSize, color, cena, sex);
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }

    @Override
    public void DressMen() {
        System.out.println("tie men: " + "cena = " + super.getCena() + "   euroSize = " + super.getClothesSize() + "   color - " + super.getColor());
    }

}
