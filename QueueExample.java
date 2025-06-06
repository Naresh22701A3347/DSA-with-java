package demo;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExample{

	public static void main(String[] args) {
		Queue<String> names = new LinkedList<String>();
		names.add("manaswin");
		names.add("akshai");
		names.add("naresh");
		names.add("charlie");
		names.add("ganaesh");
		System.out.println(names);
		System.out.println(names.peek());
		System.out.println(names.poll());
		System.out.println(names);
	}

}
