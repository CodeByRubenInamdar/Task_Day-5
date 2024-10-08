package com.demo.mutbale;  
public class Mutable {  
    public static void main(String[] args) {
        // Creating the first mutable StringBuilder object initialized with "Hello"
        StringBuilder sb = new StringBuilder("Hello");

        // Creating the second mutable StringBuilder object initialized with "Java"
        StringBuilder sb1 = new StringBuilder("Java");

        // Modifying the first StringBuilder object by appending " Word"
        sb.append(" Word");

        // Modifying the second StringBuilder object by appending " Language"
        sb1.append(" Language");

        // Printing the modified content of the first StringBuilder object
        System.out.println("After changing sb " + sb.toString());  // Output: Hello Word

        // Printing the modified content of the second StringBuilder object
        System.out.println("After changing sb1 " + sb1.toString());  // Output: Java Language
    }
}
