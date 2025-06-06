package demo;

import java.util.Stack;

public class StackPalindrome {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("manaswin");
        names.push("akshai");
        names.push("bob");
        names.push("charlie");
        names.push("ganesh");
        System.out.println("Checking palindromes in the stack:");
        for (String name : names) {
            if (isPalindrome(name)) {
                System.out.println(name + " is a forward.");
            } else {
                System.out.println(name + " is a backward .");
            }
        }
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
