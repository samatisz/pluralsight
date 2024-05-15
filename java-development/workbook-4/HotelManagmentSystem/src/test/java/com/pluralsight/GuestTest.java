package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    public void checkIn_GuestChecksIn_IsCheckedInTrue() {

        //arrange
        Guest guest1 = new Guest("Mingi Song", 24);

        //act
        guest1.checkIn();

        //assert
        assertTrue(guest1.isCheckedIn(), "Guest should be checked in after check-in process.");
    }

    @Test
    public void checkOut_GuestChecksOut_IsCheckedInFalse() {

        //arrange
        Guest guest1 = new Guest("Jongho Choi" , 24);
        guest1.checkIn();

        //act
        guest1.checkIn();

        //assert
        assertFalse(guest1.isCheckedIn(), "Guest should not be checked in after check out operations.");

    }



}