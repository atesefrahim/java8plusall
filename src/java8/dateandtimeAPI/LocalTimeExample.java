package java8.dateandtimeAPI;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

    public static void main(String[] args) {

        // Find right now
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime :"+localTime);

        // find Istanbul time

        LocalTime istTime = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Current Time in IST="+istTime);


        // specific time
        LocalTime specificTime = LocalTime.of(16,29,25,40);
        System.out.println("Specific Time of Day="+specificTime);
    }
}
