package com.pluralsight;

import java.util.Scanner;

/*create a java app named PayrollCalc that prompts the user to enter:
their name, hours worked (float), pay rate (calculate gross pay)
display their name and gross pay
*/

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);

        System.out.println( "Enter your name: ");
        String name = nameScanner.nextLine();

        System.out.println("Enter hours worked: ");
        double hours = nameScanner.nextDouble();

        System.out.println("Enter pay rate: ");
        double rate = nameScanner.nextDouble();

        double grossPay = hours * rate;

        System.out.println("Name: " + name + " " + "Gross Pay: $" + grossPay);

    }
}
