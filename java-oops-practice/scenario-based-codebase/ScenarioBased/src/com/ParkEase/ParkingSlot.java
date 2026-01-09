package ParkEase;

class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    private String bookingLog; // internal record

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void assignSlot(Vehicle vehicle) {
        if (!isOccupied) {
            isOccupied = true;
            bookingLog = "Slot " + slotId + " booked for " + vehicle.vehicleNumber;
        }
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog += "\nSlot released\n";
    }

    public void showLog() {
        System.out.println("Booking Log: " + bookingLog);
    }
}
