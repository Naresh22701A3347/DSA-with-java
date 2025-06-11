package javaprojects;

public class LinearTimeExample {
	public static void printAllElements(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements"+i+":"+arr[i]);
		}
	}

	public static void main(String[] args) {
     int [] numbers = {10,20,30,40,50,23};
     printAllElements(numbers);
	}
}
