package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    public void getTotalBookings_ThreeBookings_ExpectTotalBookingsThree() {
        //Arrange
        Room room1 = new Room(102, "Double");
        Room room2 = new Room(103, "Suite");
        Room room3 = new Room(104, "Single");

        Guest guest1 = new Guest("Alice Johnson", 25);
        Guest guest2 = new Guest("Bob Smith", 35);
        Guest guest3 = new Guest("Charlie Garcia", 45);

        room1.bookRoom(guest1);
        room2.bookRoom(guest2);
        room3.bookRoom(guest3);

        //Act
        int actualTotalBookings = Hotel.getTotalBookings();

        //Assert
        assertEquals(3, actualTotalBookings);

    }
}