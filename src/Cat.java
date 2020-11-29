public class Cat extends Animal {
    String name;
    String soundCat;

    public Cat() {
    }

    public Cat(String food, String lokation, String name, String soundCat) {
        super(food, lokation);
        this.name = name;
        this.soundCat = soundCat;
    }

    public String getName() {
        return name;
    }

    public String getSoundCat() {
        return soundCat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoundCat(String soundCat) {
        this.soundCat = soundCat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", soundCat='" + soundCat + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + "   " + this.getSoundCat());
        super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "    eat");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + "    sleep");
        super.sleep();
    }


}
