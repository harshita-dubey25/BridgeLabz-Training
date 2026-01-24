package com.ticketbookingSystem;

class EventNode {
    int eventTime;        
    int height;
    String eventId;
    String eventName;

    EventNode left, right;

    EventNode(String id, String name, int time) {
        eventId = id;
        eventName = name;
        eventTime = time;
        height = 1;
    }
}
