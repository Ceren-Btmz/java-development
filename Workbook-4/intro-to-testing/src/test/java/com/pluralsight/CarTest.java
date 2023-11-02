package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void accelerate_should_increaseCarSpeed() {
        // arrange
        Car car = new Car("Ford", "f150 Raptor");
        int speedChange = 15;
        int expectedSpeed = 15;

        // act
        car.accelerate(speedChange);

        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void brake_should_decreaseCarSpeed() {
        // arrange
        Car car = new Car("Ford", "f150 Raptor");
        int speedUpBy = 15;
        car.accelerate(speedUpBy);
        int slowDownBy = 10;
        int expectedSpeed = 5;

        // act
        car.brake(slowDownBy);

        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void brake_should_stopCar_whenChangeIsGreater(){
        // arrange
        Car car = new Car("Ford", "f150 Raptor");
        int speedUpBy = 15;
        car.accelerate(speedUpBy);
        int slowDownBy = 20;
        int expectedSpeed = 0; car.accelerate(speedUpBy);

        // act
        car.brake(slowDownBy);

        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}