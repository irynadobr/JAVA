package lesson4;

public class Trousers extends Clothes implements ClothesMen, ClothesWomen {


    public Trousers(ClothesSize clothesSize, String color, double cena, Sex sex) {
        super(clothesSize, color, cena, sex);
    }

    @Override
    public String toString() {
        return "Trousers{} " + super.toString();
    }

    @Override
    public void DressMen() {
        System.out.println("trousers men: " + "cena = " + "cena = " + super.getCena() + "   euroSize = " + super.getClothesSize() + "   color - " + super.getColor());
    }

    @Override
    public void DressWomen() {
        System.out.println("trousers Women: " + "cena = " + "cena = " + super.getCena() + "   euroSize = " + super.getClothesSize() + "   color - " + super.getColor());
    }
}
