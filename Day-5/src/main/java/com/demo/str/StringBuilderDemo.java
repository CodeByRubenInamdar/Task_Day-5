package com.demo.str;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// Create two StringBuilder objects
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Java");

		// Append more text to both StringBuilder objects
		sb1.append(" World");
		sb2.append(" Programming");

		// Print the modified strings (same object is modified)
		System.out.println("Modified sb1: " + sb1); // Output: Hello World
		System.out.println("Modified sb2: " + sb2); // Output: Java Programming
	}
}
