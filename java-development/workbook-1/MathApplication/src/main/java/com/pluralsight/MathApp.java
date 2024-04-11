package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //find and display the largest of the two variables named nameSalary1 and nameSalary2 using Math.max
        //set the variables to any value
        double bobSalary = 55000.0;
        double garySalary = 65000.0;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //find and display the smallest of two variables named carPrice and truckPrice
        //set the variables to any value
        double carPrice = 20000.0;
        double truckPrice = 18000.0;
        double minPrice = Math.min(carPrice, truckPrice);

        //find and display the area of a circle, the radius is 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);

        //find and display the square root of the variable num1 after it is set to 5.0
        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println("The square root of " + num1 + " is " + sqrtNum1);

        //find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);

        //find and display the absolute (positive) value of num2 after it is set to -3.8
        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println("The absolute value of " + num2 + " is " + absNum2);




    }
}
