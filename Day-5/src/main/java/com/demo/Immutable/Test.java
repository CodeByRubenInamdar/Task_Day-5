package com.demo.Immutable;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("Ruben", 1); // Creating an immutable Person object

		System.out.println("Name " + person.getName());
		System.out.println("Age " + person.getAge());

		// Attempting to change the state of the person object is not allowed
	}
}
