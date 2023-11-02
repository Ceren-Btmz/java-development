package com.pluralsight;

public class Reservation {
    private String RoomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        RoomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        if(roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124.00;
        }
    }

    public String getRoomType() {
        return RoomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        double totalPrice = pricePerNight * numberOfNights;

        if (isWeekend) {
            totalPrice = totalPrice * 1.1;
        }
        return totalPrice;
    }

    public double getReservationTotal() {
        return getPrice();
    }
}

