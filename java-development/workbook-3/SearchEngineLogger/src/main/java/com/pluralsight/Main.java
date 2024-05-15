package com.pluralsight;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

    }

    public class SearchEngineLogger {
        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            logAction("Launching the application: ");

            System.out.println("Welcome to SearchEngineLogger!");
            System.out.println("Enter the search term: ");
            String searchTerm = myScanner.nextLine();
            logAction("Searching for term: " + searchTerm);

            System.out.println("Searching for \"" + searchTerm + "\"...");

            System.out.println();




            myScanner.close();

        }
    }





}
