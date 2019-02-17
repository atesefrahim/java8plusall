package java8.dateandtimeAPI;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("now :"+localDateTime);

        // specific date
        LocalDateTime specificDate = LocalDateTime.of(2019, Month.FEBRUARY, 17, 16, 10, 30);
        System.out.println("Specific Date="+specificDate);

        LocalDateTime istanbulToday = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Current Date in IST="+istanbulToday);
    }
}
