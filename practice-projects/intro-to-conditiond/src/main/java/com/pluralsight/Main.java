package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String name = "Ray";
        int age = 22;
        double price = 25.00;
    // == means equal to, != is not equal to, < less than , > greater than

        if (age < 18) {
            price = price * .9;
            //if condition is true, this runs; if false it will not
        } else {
            price = 60;
            //if condition is false, this runs; if true it will not

        }
        System.out.println("Price of admission: " + price);
    }

}
