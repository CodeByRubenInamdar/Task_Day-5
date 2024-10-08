package com.demo.callableRunable;

public class Teacher implements Runnable {
	private String homework;

	public Teacher(String homework) {

		this.homework = homework;
	}

	public void run() {
		System.out.println("Teacher Assinged Homework: " + homework);
	}
}
