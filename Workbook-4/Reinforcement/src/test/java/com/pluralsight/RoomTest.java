package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void bookRoom_RoomAlreadyOccupied_ExceptFalse() {
        //Arrange
        Room room = new Room(101, "Single");
        Guest guest1 = new Guest("Alice Johnson", 25);
        room.bookRoom(guest1);
        Guest guest2 = new Guest("Bob Smith", 30);

        //Act
        boolean
    }
}