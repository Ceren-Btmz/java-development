package com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = now.format(formatter1);
        System.out.println(formattedDate1);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = now.format(formatter2);
        System.out.println(formattedDate2);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate3 = now.format(formatter3);
        System.out.println(formattedDate3);

        Date date = new Date();
        SimpleDateFormat requiredFormat = new SimpleDateFormat("EEEE, MMM d, yyyy HH:mm 'in GMT'");
        requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String gmtTime = requiredFormat.format(date);
        System.out.println(gmtTime);

        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("h:mm a 'on' dd-MMM-yyyy 'in local time zone'");
        String formattedDate5 = now.format(formatter5);
        System.out.println(formattedDate5);
    }
}
