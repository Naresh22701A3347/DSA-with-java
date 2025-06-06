package demo;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> actions = new Stack<String>();
		actions.push("write");
		actions.push("delete");
		actions.push("insert");
		System.out.println(actions);
		System.out.println(actions.peek());
		System.out.println(actions.pop());
		System.out.println(actions.remove(1));
		System.out.println(actions);
	}

}
