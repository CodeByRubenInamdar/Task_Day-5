package com.demo.Immutable;

public class Person {
	private final String Name;
	private final int age;
	
	// Constructor to initialize fields
	public Person(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	// Getter for name
	
	public String getName() {
		return Name;
	}
	// Getter for age
	public int getAge() {
		return age;
	}
	
}
