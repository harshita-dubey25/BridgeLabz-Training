package com.contructorandinstancevariables.level1;

public class HotelBooking {
	
	String guestName;
	String roomType;
	int nights;
	
	HotelBooking(){
		guestName = "Harshita";
		roomType = "Double";
		nights = 5;
	}
	
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	HotelBooking(HotelBooking h){
		this.guestName = h.guestName;
		this.roomType = h.roomType;
		this.nights = h.nights;
	}
	
	void displayDetails() {
		System.out.println("Guest Name: "+guestName);
		System.out.println("Room Type: "+roomType);
		System.out.println("Nights: "+nights);
		System.out.println("_ _ _ _ _ _ _ _ _ _ ");
	}


	public static void main(String[] args) {
	
		HotelBooking h1 = new HotelBooking();
		HotelBooking h2 = new HotelBooking("Ansh","Double",5);
		HotelBooking h3 = new HotelBooking("Brajkalp","Double",365);
		HotelBooking h4 = new HotelBooking(h3);
		
		h1.displayDetails();
		h2.displayDetails();
		h3.displayDetails();
		h4.displayDetails();

	}

}
