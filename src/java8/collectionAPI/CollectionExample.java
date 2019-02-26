package java8.collectionAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        //String data = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha";


        List<String> collLists = Arrays.asList("Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha".split("\n"));

        String output="";

        String str=  "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?";

        for(String mn : collLists){
            if(mn.contains("hone")) {
                mn = mn.replace(" title", "");

                output = mn.substring(0,8);
                output=output+ " Ladder";
                System.out.println(output);
            }
            else if(mn.contains("rogram")) {
                mn = mn.replace(" title", "");

                output = mn.substring(0,8);
                output=output+ " Ladder";
                System.out.println(output);
            }
            else if(mn.contains("uthor")) {
                output = output + " "+ mn.substring(0,7);
                output=output+ " g964";
                System.out.println(output);
            }
            else if(mn.contains("hone")) {
                output = output + " "+ mn.substring(0,6);
                output=output+ " +1-503-555-0090";
                System.out.println(output);
            }
            else if(mn.contains("ate")) {
                LocalDate firstDayofDate = LocalDate.of(2019, 1, 1);
                System.out.println("first day :"+firstDayofDate);

                output = output + " "+ mn.substring(0,5);
                output=output+ " " + firstDayofDate;
                System.out.println(output);
            }
            }
            output = output + " Version:"+" 1.1";
            System.out.println(output);



        //System.out.println(collLists);

        List<String> collList = Arrays.asList("ibrahim", "ates");


        collList.forEach(pr -> System.out.println(collList));

        List<CollectionObject> collectionObjects = Arrays.asList(new CollectionObject("ibrahim", 28, ""), new CollectionObject("ates", 29, ""), new CollectionObject("asd", 30, ""));
        collectionObjects.forEach(pr->pr.setAddress("Cizre"));

        collectionObjects.forEach(sr -> System.out.println(sr));

    }
}
