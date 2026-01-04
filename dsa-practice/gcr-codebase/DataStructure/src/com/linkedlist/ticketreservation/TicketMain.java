package com.linkedlist.ticketreservation;

public class TicketMain {
	public static void main(String[] args) {
	    TicketReservationSystem system = new TicketReservationSystem();
	    system.addTicket(101, "Nageshwar", "Inception", "A1", "10:00 AM");
	    system.addTicket(102, "Himesh", "Avatar", "B5", "01:00 PM");
	    
	    system.displayTickets();
	    System.out.println("Total: " + system.getTotalTickets());
	    
	    system.search("Inception");
	    system.removeTicket(101);
	    system.displayTickets();
	}
}
