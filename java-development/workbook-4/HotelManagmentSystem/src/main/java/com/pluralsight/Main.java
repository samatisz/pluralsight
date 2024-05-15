package com.pluralsight;

import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {


        Room room127 = new Room(127, "King");
        Room room128 = new Room(128, "king");
        Room room129 = new Room(129, "Double");

        Guest guest1 = new Guest("Hongjoong Kim", 25);
        Guest guest2 = new Guest("Seonghwa Park", 26);
        Guest guest3 = new Guest("Yunho Jeong", 25);

        Staff staff1 = new Staff("Wooyoung Jeong", "Housekeeping", 1234);
        Staff staff2 = new Staff("Jongho Choi", "Receptionist", 2345);

        boolean bookingResult = room127.bookRoom(guest1);//boolean cause either checkedIn or !checkedIn

        System.out.println("Room  127 booking status for Hongjoong: " + bookingResult);

        System.out.println("Current Total Bookings: " + Hotel.getTotalBookings());


        boolean bookingResult2 = room128.bookRoom(guest2);

        System.out.println("Room  128 booking status for Seonghwa: " + bookingResult2);

        System.out.println("Current Total Bookings: " + Hotel.getTotalBookings());


        boolean bookingResult3 = room127.bookRoom(guest3);

        System.out.println("Room 127 booking status for Yunho: " + bookingResult3);

        System.out.println("Current Total Bookings: " + Hotel.getTotalBookings());

        System.out.println("Room 127 is occupied: " + room127.isOccupied);
        System.out.println("Room 128 is occupied: " + room128.isOccupied());
        System.out.println("Room 129 is occupied: " + room129.isOccupied);

        System.out.println("Hongjoong is checked in: " + guest1.isCheckedIn());
        System.out.println("Seonghwa is checked in: " + guest2.isCheckedIn());
        System.out.println("Yunho is checked in: " + guest3.isCheckedIn());

        String duty1 = staff1.performDuty("Clean room 129.");
        System.out.println(duty1);

        String duty2 = staff2.performDuty("Check in Hongjoong Kim.");
        System.out.println(duty2);

        room127.vacantRoom(guest1);

        System.out.println("Room is occupied after Hongjoong checks out: " + room127.isOccupied);
        System.out.println("Hongjoong is checked in after checking out: " + guest1.isCheckedIn());

        System.out.println("Current total bookings: " + Hotel.getTotalBookings());


    }
}
