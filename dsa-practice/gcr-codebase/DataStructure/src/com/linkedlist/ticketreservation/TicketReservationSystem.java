package com.linkedlist.ticketreservation;

public class TicketReservationSystem {
	private TicketNode head = null;
	private TicketNode tail = null;
	
	public void addTicket(int id, String name, String movie, String seat, String bookingTime) {
		TicketNode newNode = new TicketNode(id, name, movie, seat, bookingTime); 	
		
		if(head==null) {
			head = newNode;
			tail = newNode;
			newNode.next = head; 
		}
		else {
			tail.next = newNode;
			tail = newNode;
			tail.next=head;
		}
	}
	
	public void removeTicket(int id) {
		if(head==null)
			return;
		
		TicketNode curr = head;
		TicketNode prev = tail;
		
		do {
			if(curr.ticketId == id) {
				if(curr ==head && curr==tail) {
					head =null;
					tail = null;
				}
				else {
					prev.next = curr.next;
                    if (curr == head) head = head.next;
                    if (curr == tail) tail = prev;
                }
                System.out.println("Ticket " + id + " removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket ID " + id + " not found.");
    	}
	
	public void displayTickets() {
        if (head == null) {
            System.out.println("The reservation list is empty.");
            return;
        }
        TicketNode temp = head;
        System.out.println("\n--- Current Bookings ---");
        do {
            System.out.println("ID: " + temp.ticketId + " | Name: " + temp.custName + 
                               " | Movie: " + temp.movieName + " | Seat: " + temp.seatno);
            temp = temp.next;
        } while (temp != head);
    }
	
	public void search(String query) {
        if (head == null) return;
        TicketNode temp = head;
        boolean found = false;
        do {
            if (temp.custName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Found Match: ID " + temp.ticketId + " for " + temp.custName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No records found for: " + query);
    }
	
	public int getTotalTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}
