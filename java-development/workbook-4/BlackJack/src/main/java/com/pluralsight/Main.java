package com.pluralsight;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Virtual Blackjack!");

        System.out.println("Player 1 name: ");
        String playerOneName = myScanner.nextLine();

        System.out.println("Player 2 name: ");
        String playerTwoName = myScanner.nextLine();
    }
}
