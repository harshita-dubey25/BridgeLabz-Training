package com.eventease;

class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                          int attendees, double venueCost, double serviceCost,
                          double discount, User organizer) {
        super(eventName, location, date, attendees, venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday Event Scheduled!");
        System.out.println("Event ID: " + getEventId());
        System.out.println("Total Cost: ₹" + calculateCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}
