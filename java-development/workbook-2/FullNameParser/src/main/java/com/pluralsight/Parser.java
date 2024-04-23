package com.pluralsight;

import java.util.Scanner;

public class Parser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String fullName = scanner.nextLine().trim();

        int spacePosition1 = fullName.indexOf(" ");

        String firstName = fullName.substring(0, spacePosition1);
        System.out.println(firstName);
        String remainderName = fullName.substring(spacePosition1, +1);






    }
}
