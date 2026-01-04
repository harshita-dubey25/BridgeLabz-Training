package com.linkedlist.ticketreservation;

public class TicketNode {
	public int ticketId;
	public String custName;
	public String movieName; 
	public String seatno;
	public String bookingTime;
	public TicketNode next;
	
	public TicketNode(int id, String custName, String movieName, String seatNo, String bookingTime) {
		this.ticketId =id;
		this.custName = custName;
		this.movieName = movieName;
		this.seatno = seatNo;
		this.bookingTime = bookingTime;
	}
}
