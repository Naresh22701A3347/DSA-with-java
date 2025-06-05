package javaprojects;
import java.util.Scanner;
public class Calender {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday":
			System.out.println("lets start python");
			break;
		case "tuesday":
			System.out.println("lets start java");
			break;
		case "wednesday":
			System.out.println("lets start c");
			break;
		case "thrusday":
			System.out.println("lets start WEB");
			break;
		case "friday":
			System.out.println("lets start c++");
			break;
		case "saturday":
			System.out.println("lets start ML");
			break;
		case "sunday":
			System.out.println("lets start js");
			break;
		default:
			break;	
		}
	}
}
