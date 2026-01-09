package com.eventease;

abstract class Event implements ISchedule {
	private final int eventId;
	private static int counter = 1000;
	
	protected String eventName;
	protected String location;
	protected String date;
	protected int attendees;
	
	protected double venueCost;
	protected double serviceCost;
	protected double discount;
	
	protected User organizer;
	
	public Event(String eventName,String location,String date,int attendees,User organizer){
		this.eventId = ++counter;
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.attendees = attendees;
		this.organizer = organizer;
	}
	
	public Event(String eventName, String location, String date, int attendees,double venueCost, double serviceCost, double discount, User organizer) {
        this(eventName, location, date, attendees, organizer);
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
   }
	
    public int getEventId() {
    	return eventId;
    }
	
	protected double calculateCost() {
		return venueCost + serviceCost - discount;
	}
}
