package com.classandobject.level2;

public class MovieTicketDetails {

	public static void main(String[] args) {
				MovieTicket ticket1=new MovieTicket("Dragon");
				
				ticket1.displayTicket();
				ticket1.bookTicket("A10",120.0);
				ticket1.bookTicket("B10", 120.0);
				ticket1.bookTicket("A11", 120.0);
				ticket1.displayTicket();
	}

}
