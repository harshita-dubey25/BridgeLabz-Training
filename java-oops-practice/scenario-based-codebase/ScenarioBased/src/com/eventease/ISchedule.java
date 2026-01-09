package com.eventease;

public interface ISchedule {
	void schedule();
	void reschedule(String newDate);
	void cancel();
}
