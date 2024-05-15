package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest { //test case will always be void

    @Test
    public void bookRoom_RoomAlreadyOccupied_ExpectFalse() {
        //arrange
        Guest guest1 = new Guest("Hongjoong Kim", 25);
        Room room = new Room(127, "King");
        room.bookRoom(guest1);
        Guest guest2 = new Guest("Seonghwa Park", 26);

        //act
        boolean result = room.bookRoom(guest2);

        //assert
        assertFalse(result, "Room should not be bookable if already occupied!");

    }


}