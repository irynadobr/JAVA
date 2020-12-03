package lesson3b;

public class Tube implements Tool {
    private String name;
    private int diameter;

    public Tube() {
    }

    public Tube(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println("play " + this.getName() + "  with  " + "diameter: " + this.getDiameter());
    }
}
