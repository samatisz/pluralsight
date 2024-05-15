package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_shouldBe_occupiedAndDirty() {

        //arrange
        Room newRoom = new Room(2, 127.00);
        //nothing in parameter so no more is added here

        //act
        newRoom.checkIn();

        //assert
        assertTrue(newRoom.isOccupied());
        assertTrue(newRoom.isDirty());

    }

    @Test
    public void checkOut_shouldBe_checkedOut() {

        //arrange
        Room newRoom = new Room(2,127);

        //act
        newRoom.checkout();

        //assert
        assertFalse(newRoom.isOccupied());

    }

    @Test
    public void cleanRoom_shouldNotBe_occupiedOrDirty() {

        //arrange
        Room newRoom = new Room(2, 127);

        //act
        newRoom.cleanRoom();

        //assert

    }




}