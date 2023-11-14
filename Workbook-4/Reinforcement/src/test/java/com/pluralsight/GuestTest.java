package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {
    public void checkIn_GuestChecksIn_IsCheckedInTrue() {
        //Arrange
        Guest guest = new Guest("Alice Johnson", 25);

        //Act
        guest.checkIn();

        //Assert
        assertTrue(guest.isCheckedIn()), "Guest should be checked in after process");
    }

    public void checkOut_GuestChecksOut_IsCheckedInFalse() {
        //Arrange
        Guest guest = new Guest("Alice Johnson", 25);
        guest.checkIn();

        //Act
        guest.checkOut();

        //Assert
        assertTrue(guest.isCheckedIn()), "Guest should be checked in after process");
    }
}