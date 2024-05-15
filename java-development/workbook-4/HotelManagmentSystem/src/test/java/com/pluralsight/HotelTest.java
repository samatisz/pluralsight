package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    public void getTotalBookings_ThreeBookings_ExpectTotalBookingThree() {

        //arrange
        Room room1 = new Room(127, "King");
        Room room2 = new Room(128, "Double");
        Room room3 = new Room(129, "King");

        room1.bookRoom(new Guest("Yeosang Kang", 25));
        room2.bookRoom(new Guest("San Choi", 25));
        room3.bookRoom(new Guest("Wooyoung Jung", 24));

        //act
        int actualTotalBookings = Hotel.getTotalBookings();

        //assert

        assertEquals(3, actualTotalBookings, "Total bookings should match the number of rooms booked.");
    }

}