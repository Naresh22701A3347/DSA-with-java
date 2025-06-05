package javaprojects;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

    public static void main(String[] args) {
        String[] names = {"anit", "divya", "karan", "priya", "zoya"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String userInput = scanner.nextLine();

        if (Arrays.asList(names).contains(userInput)) {
            System.out.println("Found: " + userInput);
        } else {
            System.out.println("Not found: " + userInput);
        }

        scanner.close();
    }
}