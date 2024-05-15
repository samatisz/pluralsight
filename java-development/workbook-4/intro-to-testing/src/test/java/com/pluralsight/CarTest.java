package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test //this shows java that this is a test case, not a normal method - always needs @test
    public void accelerate_should_increaseCarSpeed() { //test case will not return anything
        //test case should have 3 parts - arrange, act, assert (aaa pattern)

        //arrange - create variables
        Car newCar = new Car("Shelby", "Mustang GT350");
        int speedChange = 15;
        int expectedSpeed = 15;

        //act - call method you want to test
        newCar.accelerate(speedChange);

        //assert -have accepted result, compare expected result with actual result
        int actualSpeed = newCar.getSpeed();
        assertEquals(expectedSpeed, actualSpeed); //this method compares the two

    }

    @Test
    public void brake_should_decreaseSpeed() {
       //arrange
        Car newCar = new Car("Shelby", "Mustang GT350");
        int speedUpBy = 15;
        int slowDownBy = 10;
        int expectedSpeed = 5;      newCar.accelerate(speedUpBy);

        //act
        newCar.brake(slowDownBy);

        //assert
        int actualSpeed = newCar.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);

    }
}