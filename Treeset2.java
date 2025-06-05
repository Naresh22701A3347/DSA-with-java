package javaprojects;

import java.util.Scanner;
import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args) {
		TreeSet<String> product = new TreeSet<String>();
		product.add("keyboard");
		product.add("mouse");
		product.add("monitor");
		product.add("cpu");
		product.add("webcam");
		System.out.println(product);
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the name of the product:");
	        String userInput = scanner.nextLine();
	        
	        if (product.contains(userInput)) {
	            System.out.println("Found: " + userInput);
	        } else {
	            System.out.println("Not found: " + userInput);
	        }
	        
	        scanner.close();
	    }
	}