package com.pluralsight;

public class Room {
    private int roomNumber;
    String roomType;
    boolean isOccupied;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean bookRoom() { //it is a boolean so no void
        if (!isOccupied) { //! is NOT
            isOccupied = true;
            Hotel.increaseTotalBookings(); //had to call the class with the increaseTotal method
            return true;
        }
        return false;
    }

    public boolean bookRoom(Guest guest) {
        if (!isOccupied) { //! is NOT
            isOccupied = true;
            Hotel.increaseTotalBookings();
            guest.checkIn(); //this adds to method so guest can check in
            return true;
        }
        return false;
    }

    public void vacantRoom() {
        isOccupied = false;
        Hotel.decreaseTotalBookings();
    }

    public void vacantRoom(Guest guest) { //parameters make it overloaded
        isOccupied = false;
        Hotel.decreaseTotalBookings();
        guest.checkOut();
    }
}
