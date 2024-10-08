package com.demo.callableRunable;
import java.util.concurrent.*;

public class Test {
	
	    public static void main(String[] args) {
	        // Create a Teacher and assign homework
	        Teacher teacher = new Teacher("Math Problems");
	        Thread teacherThread = new Thread(teacher);
	        teacherThread.start();

	        // Create an ExecutorService for students
	        ExecutorService executor = Executors.newFixedThreadPool(3);
	        
	        // Create students with the same homework
	        Student student1 = new Student("Math Problems");
	        Student student2 = new Student("Math Problems");
	        Student student3 = new Student("Math Problems");

	        // Submit student tasks to the executor
	        Future<String> result1 = executor.submit(student1);
	        Future<String> result2 = executor.submit(student2);
	        Future<String> result3 = executor.submit(student3);

	        // Retrieve and print the results from students
	        try {
	            System.out.println(result1.get()); // Get result from student 1
	            System.out.println(result2.get()); // Get result from student 2
	            System.out.println(result3.get()); // Get result from student 3
	        } catch (InterruptedException | ExecutionException e) {
	            e.printStackTrace();
	        } finally {
	            executor.shutdown(); // Shutdown the executor
	        }
	    }
	}

