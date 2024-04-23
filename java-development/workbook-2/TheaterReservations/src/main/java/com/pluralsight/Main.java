package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your full name:");
        String fullName = myScanner.nextLine().trim();
        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace +1);

        System.out.print("Date of the show: (MM/DD/YYYY)");
        String showDate = myScanner.nextLine().trim();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(showDate,formatter);

        System.out.print("How many tickets would you like?:");
        int numTickets = myScanner.nextInt();

        System.out.println(numTickets + " tickets reserved for " + date + " under " + lastName + ", " + firstName + ".");

        myScanner.close();
        //always close the scanner to stop it - it takes up space



    }
}
