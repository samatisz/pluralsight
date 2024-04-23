package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();
        CellPhone cellPhon2 = new CellPhone();

        System.out.println("Enter the information for Cell Phone 1:");

        System.out.println("What is the serial number?");
        int serialNum = myScanner.nextInt();
        cellPhone.setSerialNumber(serialNum);
        myScanner.nextLine();
        System.out.println(cellPhone.getSerialNumber());

        System.out.println("What model is the phone?");
        String model = myScanner.nextLine();
        cellPhone.setModel(model);
        System.out.println(cellPhone.getModel());

        System.out.println("Who is the carrier?");
        String carrier = myScanner.nextLine();
        cellPhone.setCarrier(carrier);
        System.out.println(cellPhone.getCarrier());

        System.out.println("What is the phone number?");
        String phoneNumber = myScanner.nextLine();
        cellPhone.setPhoneNumber(phoneNumber);
        System.out.println(cellPhone.getPhoneNumber());

        System.out.println("Who is the owner of the phone?");
        String owner = myScanner.nextLine();
        cellPhone.setOwner(owner);
        System.out.println(cellPhone.getOwner());

        myScanner.close();


    }
}
