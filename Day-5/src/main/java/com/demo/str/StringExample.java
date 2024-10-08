package com.demo.str;

public class StringExample {
	public static void main(String[] args) {
		// Create two String objects
		String str1 = "Hello";
		String str2 = "Java";

		// Concatenate the strings (creates new objects)
		String result1 = str1 + " World";
		String result2 = str2 + " Programming";

		// Print the original and modified strings
		System.out.println("Original str1: " + str1); // Output: Hello
		System.out.println("Modified result1: " + result1); // Output: Hello World

		System.out.println("Original str2: " + str2); // Output: Java
		System.out.println("Modified result2: " + result2); // Output: Java Programming
	}
}
