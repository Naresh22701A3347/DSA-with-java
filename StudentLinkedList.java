package javaprojects;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentLinkedList {

    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names of 5 students:");        
        for(int i = 1; i <= 5; i++) {
            System.out.print("Enter student " + i + " name: ");
            String name = sc.nextLine();
            students.add(name);
        }
        System.out.println("\nList of students:");
        for(int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }        
        System.out.println("\nLinkedList Operations:");
        System.out.println("Total students: " + students.size());
        System.out.println("First student: " + students.getFirst());
        System.out.println("Last student: " + students.getLast());
        System.out.print("\nEnter a name to search: ");
        String searchName = sc.nextLine();
        if(students.contains(searchName)) {
            System.out.println(searchName + " is in the list at position: " + 
                             (students.indexOf(searchName) + 1));
        } else {
            System.out.println(searchName + " is not in the list.");
        }
        
        sc.close();
    }
}