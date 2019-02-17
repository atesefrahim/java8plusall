package java8.dateandtimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseandFormat {

    public static void main(String[] args) {

        // get default date
        LocalDate localDate =LocalDate.now();
        System.out.println("today :"+localDate);

        // formatted
        System.out.println("formatted date 1:"+localDate.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

        System.out.println("formatted date ISO Date :"+localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
    }
}
