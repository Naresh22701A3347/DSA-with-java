package demo;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> Cc = new ArrayList<String>();
		Cc.add("doremon");
		Cc.add("benten");
		Cc.add("tom and jerry");
		Cc.add("little krishna");
		Cc.add("jackie chan");
		System.out.println(Cc);
		System.out.println(Cc.remove(1));
		Cc.add("dragonbooster");
		System.out.println(Cc);
	}

}
