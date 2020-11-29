//        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод makeNoise, например, может выводить на консоль "Такое-то животное с

public class Animal extends Veterinarian {
    private String food;
    private String lokation;

    public Animal() {
    }

    public Animal(String food, String lokation) {
        this.food = food;
        this.lokation = lokation;
    }

    public String getFood() {
        return food;
    }

    public String getLokation() {
        return lokation;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLokation(String lokation) {
        this.lokation = lokation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", lokation='" + lokation + '\'' +
                '}';
    }

    public void makeNoise() {
        System.out.println("-------------------");
    }

    public void eat() {
        System.out.println("-------------------");
    }

    public void sleep() {
        System.out.println("-------------------");
    }

    @Override
    public void treatAnimal(Animal animal) {
        super.treatAnimal(animal);
        System.out.println("food: " + this.food + "  lokation: " + this.lokation);
    }
}
