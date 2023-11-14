package com.pluralsight;

public class Hotel {
    private static int totalBookings;

    public static int getTotalBookings() {
        return totalBookings;
    }

    public static void increaseTotalBookings() {
        totalBookings++;
    }

    public static void decreaseTotalBookings() {
        totalBookings--;
    }
}
