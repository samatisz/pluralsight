package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = myScanner.nextLine().trim();
        System.out.print("Shipping Street: ");
        String shipSt = myScanner.nextLine().trim();
        System.out.print("Shipping City: ");
        String shipCt = myScanner.nextLine().trim();
        System.out.print("Shipping State: ");
        String shipState = myScanner.nextLine().trim();
        System.out.print("Shipping zip code: ");
        String shipZip = myScanner.nextLine().trim();

       System.out.print("Billing Street: ");
        String billSt = myScanner.nextLine().trim();
        System.out.print("Billing City: ");
        String billCt = myScanner.nextLine().trim();
        System.out.print("Billing State: ");
        String billState = myScanner.nextLine().trim();
        System.out.print("Billing Zip Code: ");
        String billZip = myScanner.nextLine().trim();

        StringBuilder potatoBuild = new StringBuilder();
        potatoBuild.append(userName).append("\n\n");

        potatoBuild.append("Billing Address:\n");
        potatoBuild.append(billSt).append("\n");
        potatoBuild.append(billCt).append(", ");
        potatoBuild.append(billState).append(" ");
        potatoBuild.append(billZip).append("\n");

        potatoBuild.append("Shipping Address:\n");
        potatoBuild.append(shipSt).append("\n");
        potatoBuild.append(shipCt).append(", ");
        potatoBuild.append(shipState).append(" ");
        potatoBuild.append(shipZip).append("\n");

        System.out.println(potatoBuild.toString());













    }
}
