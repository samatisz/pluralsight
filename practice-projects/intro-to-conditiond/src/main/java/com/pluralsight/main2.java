package com.pluralsight;

public class main2 {
    public static void main(String[] args) {

            String name = "Ray";
            int age =22;
            double price = 25.00;
            // == means equal to, != is not equal to, < less than , > greater than

            if (age < 18) {
                price = 18;
            } else if (age < 65) {
                price = 25;
            } else {
                price = 20;
            }
            System.out.println("Price of admission: " + price);
        }
    }
