package lesson3b;

public class Guitar implements Tool {
    private String name;
    private int numberStrings;

    public Guitar() {
    }

    public Guitar(String name, int numberStrings) {
        this.name = name;
        this.numberStrings = numberStrings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    public void setNumberStrings(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "name='" + name + '\'' +
                ", numberStrings='" + numberStrings + '\'' +
                '}';
    }

    @Override
    public void play() {
        System.out.println("play " + this.getName() + "   with    " + "number of strings:  " + this.getNumberStrings());
    }

}
