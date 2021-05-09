package java8.dateandtimeAPI;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateExample {

    public static void main(String[] args) {
        // Get current date
        LocalDate today = LocalDate.now();
        System.out.println("now :"+today);


        // get first day of given date...
        LocalDate firstDayofDate = LocalDate.of(today.getYear(), today.getMonth(), 1);
        System.out.println("first day :"+firstDayofDate);


        // get zone date
        LocalDate zoneDate = LocalDate.now(ZoneId.of("Asia/Istanbul"));
        System.out.println("zone date of Istanbul :"+zoneDate);

        // get new date after base date. // Find Coding date
        LocalDate baseDate = LocalDate.ofEpochDay(17944);
        System.out.println("15000 day after base date :"+baseDate);

        // calculate day of giving date
        LocalDate dayth = LocalDate.ofYearDay(2019, 48);
        System.out.println("48 th day of 2019 :"+dayth);

        // find max of date
        LocalDate maxDate = LocalDate.MAX;
        System.out.println("maxDate :"+maxDate);

        // find min of date
        LocalDate minDate = LocalDate.MIN;
        System.out.println("minDate :"+minDate);


        System.out.println("Year "+today.getYear()+" is Leap Year? "+today.isLeapYear());

        //Compare two LocalDate for before and after
        System.out.println("Today is before 01/01/2019? "+today.isBefore(LocalDate.of(2019,1,1)));
    }
}
