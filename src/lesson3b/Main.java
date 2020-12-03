//        Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
//        Гитара содержит переменные класса количество Струн,  Барабан - размер, Труба - диаметр.
//        Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
//        "Играет такой-то инструмент c такими то характеристиками".

package lesson3b;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Tool> tools = new ArrayList<>();
        tools.add(new Guitar("guitar", 7));
        tools.add(new Drum("drum", 40));
        tools.add(new Tube("tube", 60));
        for (Tool tool : tools) {
            tool.play();
        }


    }
}
