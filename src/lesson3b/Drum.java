package lesson3b;

public class Drum implements Tool {
    private String name;
    private int size;

    public Drum() {
    }

    public Drum(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("play " + this.getName() + "  with  " + "size: " + this.getSize());
    }
}
