package javaprojects;

import java.util.Stack;

public class Stacktask {

    public static void main(String[] args) {
        Stack<String> stackingPlates = new Stack<>();
        stackingPlates.push("Plate 1");
        stackingPlates.push("Plate 2");
        stackingPlates.push("Plate 3");
        stackingPlates.push("Plate 4");
        stackingPlates.push("Plate 5");
        System.out.println("Top plate before serving: " + stackingPlates.peek());
        String servedPlate = stackingPlates.pop();
        System.out.println("Serving: " + servedPlate);
        System.out.println("Plates remaining: " + stackingPlates.size());
        System.out.println("Current stack: " + stackingPlates);
    }
}
