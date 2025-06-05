package javaprojects;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<String, String> concap = new TreeMap<String,String>();
		concap.put("india-","new delhi");
		concap.put("usa-","washington");
		concap.put("germany-","berlin");
		concap.put("japan-","Tokyo");
		concap.put("india-","delhi");
		System.out.println(concap);
		
	}

}
