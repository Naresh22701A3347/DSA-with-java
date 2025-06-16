package javaprojects;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> bookid = new TreeSet<Integer>();
		bookid.add(5002);
		bookid.add(4998);
		bookid.add(5005);
		bookid.add(4999);
		bookid.add(5001);
		System.out.println(bookid);
		System.out.println(bookid.first());
		System.out.println(bookid.last());
		System.out.println(bookid.higher(4999));
		System.out.println(bookid.lower(5005));
		System.out.println(bookid);
	}

}
