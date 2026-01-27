package com.Junit;

public class TaskManager {
    public String longRunningTask() {

	try {
	    Thread.sleep(3000);
	} catch (InterruptedException e) {
	    Thread.currentThread().interrupt();
	}

	return "Task completed";
    }
}