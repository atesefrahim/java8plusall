package trkcl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class q2 {
    public static void main(String[] args) {
        String s = "baaabb";
        System.out.println(String.format("id = %08.2f", 423.147));

        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        dateFormat.setTimeZone(timeZone);
        String isoFormat = dateFormat.format(new Date());
    }

    public static boolean solution(String S) {
        // write your code in Java SE 8
        if(S.contains("ba")){
            return false;
        }
        else return true;

    }
}
