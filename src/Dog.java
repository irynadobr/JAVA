public class Dog extends Animal {
    String name;
    String soundDog;

    public Dog() {
    }

    public Dog(String food, String lokation, String name, String soundDog) {
        super(food, lokation);
        this.name = name;
        this.soundDog = soundDog;
    }

    public String getName() {
        return name;
    }

    public String getSoundDog() {
        return soundDog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoundDog(String soundDog) {
        this.soundDog = soundDog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", soundDog='" + soundDog + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + "   " + this.getSoundDog());
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
