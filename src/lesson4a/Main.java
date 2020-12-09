package lesson4a;

public class Main {
    public static void main(String[] args) {

        Season favoriteSeason = Season.Spring;

        for (Season value : Season.values()) {
System.out.print(value.name()+ " "+value + ", ");
            value.getDescription();
        }
        System.out.print("Любима пора року:   "+ favoriteSeason.name()+ " "+favoriteSeason + ", " );
        favoriteSeason.getDescription();

    }

}
