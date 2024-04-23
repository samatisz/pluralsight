package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Please enter middle name:");
        String middleName = scanner.nextLine().trim();

        System.out.println("Please enter last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Please enter suffix: ");
        String suffixName = scanner.nextLine().trim();


        String fullName = firstName;
        //start with the starting point

        if(!middleName.isEmpty()){
            fullName = fullName + " " + middleName;
            //*if it is only for middle initial do
            //fullName = fullName + " " + middleName.charAt(0) + ".";

        }

        fullName = fullName + " " + lastName;

        if(!suffixName.isEmpty()){
            fullName = fullName + suffixName;
        }
        System.out.println("Welcome " + fullName + "!");

    }

}
