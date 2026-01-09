package com.eventease;

class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date,
                            int attendees, double venueCost, double serviceCost,
                            double discount, User organizer) {
        super(eventName, location, date, attendees, venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("📢 Conference Event Scheduled!");
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: ₹" + calculateCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled and venues released.");
    }
}

