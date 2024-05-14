package com.pluralsight;

public class Main {
            public static void main(String[] args) {
                Moped slowRide = new Moped("Vespa GTS 300", "Mint Green", 35, 25, 1, 1, 200);


                SemiTruck semiTruck = new SemiTruck("2022 Mack Anthem", "Black", 85,100,3,200,2);


                HoverCraft hoverCraft = new HoverCraft("Neoteric Recreational", "Blue", 25, 7, 4,1,2);


                Car car = new Car("Shelby AC Cobra", "Green", 201,10,2,2,2);


                // Test the functionality of the classes and methods
                slowRide.ride();
                semiTruck.loadCargo();
                hoverCraft.hover();
                car.openTrunk();

                // Accessing Vehicle getters
                System.out.println("Color of the Moped: " + slowRide.getColor());
                System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
                System.out.println("Air cushion pressure of the HoverCraft: " + hoverCraft.getAirCushionPressure());
                System.out.println("Top speed of the Car: " + car.getTopSpeed());
            }

}
