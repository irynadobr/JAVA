//Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
//        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
//        Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
//        Dog, Cat, Horse переопределяют методы makeNoise, eat.
//        Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
//        Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
//        Пусть этот метод распечатывает food и location пришедшего на прием животного.
//        В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
//        В цикле отправляйте их на прием к ветеринару.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("dog food", "Lviv", "dog", "barks");
        Cat cat = new Cat("cat food", "Kiev", "cat", "meovs");
        Horse horse = new Horse("grass", "Kiev", "horse", "igo-go");

        dog.sleep();
        dog.eat();
        dog.makeNoise();
        cat.sleep();
        cat.eat();
        cat.makeNoise();
        horse.sleep();
        horse.eat();
        horse.makeNoise();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(horse);

        for (Animal animal : animals) {
            System.out.println(animal + "- відправити на прийом до ветеринара");
            animal.treatAnimal(animal);
            System.out.println("-----------------------------------------------------------------------------");
        }
    }

}
