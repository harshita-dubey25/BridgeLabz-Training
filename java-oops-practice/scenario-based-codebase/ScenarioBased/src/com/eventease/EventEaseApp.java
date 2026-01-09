package com.eventease;

public class EventEaseApp {
    public static void main(String[] args) {

        User user1 = new User("Harshita", "harshita@gmail.com", "9876543210");

        Event birthday = new BirthdayEvent(
                "Birthday Bash", "Banquet Hall", "10-Feb-2026",
                50, 20000, 5000, 2000, user1);

        Event conference = new ConferenceEvent(
                "Tech Conference", "Convention Center", "15-Mar-2026",
                300, 100000, 30000, 10000, user1);

        birthday.schedule();
        birthday.reschedule("12-Feb-2026");

        System.out.println();

        conference.schedule();
        conference.cancel();
    }
}
