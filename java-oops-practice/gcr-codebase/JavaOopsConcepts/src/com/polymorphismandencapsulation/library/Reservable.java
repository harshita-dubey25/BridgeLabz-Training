package com.polymorphismandencapsulation.library;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
