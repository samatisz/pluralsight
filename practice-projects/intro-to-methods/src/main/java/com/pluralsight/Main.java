package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        /*
        this is the main function
        there is nothing in the main,,, so nothing will show
        you can call the method in the main
         */

        displayName();
        displayFruits();

        /*
        now it is being called
        it can be reused
         */

    }
    //this would be making a method outside of main

    public static void displayName(){
        System.out.println("Shelby");
        System.out.println("Matisz");
    }

    public static void displayFruits (){
        System.out.println("Grapes");
        System.out.println("Bananas");
    }
}
