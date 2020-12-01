package lesson2a;

public class Prince {
    private int shoe;

    public Prince() {
    }

    public Prince(int shoe) {
        this.shoe = shoe;
    }

    public int getShoe() {
        return shoe;
    }

    public void setShoe(int shoe) {
        this.shoe = shoe;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "shoe=" + shoe +
                '}';
    }
}
