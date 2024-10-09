package com.demo.futuerEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<String> future = executorService.submit(() -> {
			try {
				System.out.println("Task Started...");
				Thread.sleep(5000);
				return "Task Completed";
			} catch (InterruptedException e) {
				System.out.println("Task was Interrupted");
				return "Task interrupted";
			}
		});
		try {
			// Wait for 2 seconds before canceling the task
			TimeUnit.SECONDS.sleep(2);

			// Attempt to cancel the task
			System.out.println("Attempting to cancel the task...");
			boolean isCancelled = future.cancel(true); // Interrupt if running

			if (isCancelled) {
				System.out.println("Task was cancelled.");
			} else if (future.isDone()) {
				System.out.println("Task is already done.");
			}

			// Check if the task was cancelled
			if (future.isCancelled()) {
				System.out.println("Task was confirmed as cancelled.");
			} else {
				// Task completed successfully, retrieve result
				String result = future.get();
				System.out.println("Task completed successfully: " + result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Shut down the executor service
			executorService.shutdown();
		}
	}
}
