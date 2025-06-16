package javaprojects;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Hashset {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter student numbers and names:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter student number " + i + ": ");
            int studentNum = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            System.out.print("Enter student name " + i + ": ");
            String name = sc.nextLine();
            
            students.put(studentNum, name);
        }

        System.out.println("\nStudent details:");        
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Student #" + entry.getKey() + ": " + entry.getValue());
        }
        
        sc.close();
    }
}