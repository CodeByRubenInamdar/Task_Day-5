package com.demo.Immutable;

public class Immutable {
	public static void main(String[] args) {
		// Creating the first immutable String object initialized with "Hello"
		String str = "Hello";

		// Creating the second immutable String object initialized with "Java"
		String str1 = "Java";

		// Attempting to modify the first String object by appending " Word"
		// This does not modify the original string but creates a new one
		String modifiedStr = str.concat(" Word");

		// Attempting to modify the second String object by appending " Language"
		// This also creates a new string
		String modifiedStr1 = str1.concat(" Language");

		// Printing the original and modified strings
		System.out.println("Original str: " + str); // Output: Hello
		System.out.println("Modified str: " + modifiedStr); // Output: Hello Word

		System.out.println("Original str1: " + str1); // Output: Java
		System.out.println("Modified str1: " + modifiedStr1); // Output: Java Language
	}
}
