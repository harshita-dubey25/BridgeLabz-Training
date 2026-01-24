package com.ticketbookingSystem;

public class TicketBookingSystem {
    public static void main(String[] args) {

        EventAVL events = new EventAVL();

        events.root = events.insert(events.root, "E101", "Rock Concert", 1800);
        events.insert(events.root, "E102", "Movie Premiere", 1400);
        events.insert(events.root, "E103", "Tech Talk", 1600);
        events.insert(events.root, "E104", "Stand-up Comedy", 2000);

        System.out.println("📅 Upcoming Events:");
        events.inorder(events.root);

        System.out.println("\n❌ Cancelling Event at 1600...");
        events.root = events.delete(events.root, 1600);

        System.out.println("\n📅 Updated Events:");
        events.inorder(events.root);
    }
}
