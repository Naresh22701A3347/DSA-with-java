package javaprojects;

import java.util.Scanner;

public class HashSet {

	public static void main(String[] args) {
		HashSet<String> students = new Hashset<>();  // Added generics
	    Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter student numbers and names:");
	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Enter student number " + i + ": ");
	            sc.nextLine();
	            
	            System.out.print("Enter student name " + i + ": ");
	            String name = sc.nextLine();
	            
	            students.put(number, name);
	        }
	        
	        System.out.println("\nStudent details:");
	        
	        // Iterate through the HashMap properly
	        for (Map.Entry<Integer, String> entry : students.entrySet()) {
	            System.out.println("Student #" + entry.getKey() + ": " + entry.getValue());
	        }
	        
	        sc.close();
	    }
	
		
		

	


