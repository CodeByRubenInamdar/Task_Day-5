package com.demo.callableRunable;

import java.util.concurrent.Callable;

public class Student implements Callable<String> {
	private String homework;

	public Student(String homework) {
		super();
		this.homework = homework;
	}

	@Override
	public String call() {
		// Simulate doing homework
		try {
			Thread.sleep(2000); // Simulate time taken to complete homework
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Completed homework: " + homework;
	}
}
