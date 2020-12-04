package lesson4;

public abstract class Clothes {
    private ClothesSize clothesSize;
    private String color;
    private double cena;
    private Sex sex;

    public Clothes() {
    }

    public Clothes(ClothesSize clothesSize, String color, double cena, Sex sex) {
        this.clothesSize = clothesSize;
        this.color = color;
        this.cena = cena;
        this.sex = sex;
    }

    public ClothesSize getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(ClothesSize clothesSize) {
        this.clothesSize = clothesSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "clothesSize=" + clothesSize +
                ", color='" + color + '\'' +
                ", cena=" + cena +
                ", sex=" + sex +
                '}';
    }
}
