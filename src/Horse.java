
public class Horse extends Animal {

    private String name;
    private String soundHorse;

    public Horse() {
    }


    public Horse(String food, String lokation, String name, String soundHorse) {
        super(food, lokation);
        this.name = name;
        this.soundHorse = soundHorse;
    }

    public String getName() {
        return name;
    }

    public String getSoundHorse() {
        return soundHorse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoundHorse(String soundHorse) {
        this.soundHorse = soundHorse;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", soundHorse='" + soundHorse + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + "   " + this.getSoundHorse());
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "    eat");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + "   sleep");
        super.sleep();
    }

}
