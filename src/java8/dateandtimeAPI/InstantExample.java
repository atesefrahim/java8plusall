package java8.dateandtimeAPI;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {

    public static void main(String[] args) {

        // get current timestamp
        Instant currentTS = Instant.now();
        System.out.println("get current timestamp :"+currentTS);

        // get current timestamp for Istanbul. Instead Instant, use localdate
        LocalDateTime istanbulToday = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Current Date in IST="+istanbulToday);

        Instant istCurrentTS = Instant.now();
        System.out.println("get current timestamp :"+currentTS);

        //specific ts
        Instant specificTime = Instant.ofEpochMilli(currentTS.toEpochMilli());
        System.out.println("Specific Time = "+specificTime);

    }
}
