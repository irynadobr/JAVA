package lesson3b;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Tool>tools = new ArrayList<>();
        tools.add(new Guitar("guitar",7));
        tools.add(new Drum("drum",40));
        tools.add(new Tube("tube", 60));
        for (Tool tool:tools) {
            tool.play();
        }


    }
}
