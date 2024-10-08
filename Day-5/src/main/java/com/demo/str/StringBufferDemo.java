package com.demo.str;

public class StringBufferDemo {
	public static void main(String[] args) {
		// Create a StringBuffer object with a String argument
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Java");

		// Append more text to both StringBuffer objects
		sb1.append(" World");
		sb2.append(" Programming");

		// Print the modified strings
		System.out.println("Modified sb1: " + sb1); // Output: Hello World
		System.out.println("Modified sb2: " + sb2); // Output: Java Programming
	}
}
