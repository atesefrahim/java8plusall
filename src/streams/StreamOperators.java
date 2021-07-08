package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperators {

    public static void forEachMethod(Stream<String> stream) {
        stream.forEach(System.out::println);
    }

    public static void filterMethod(Stream<String> stream2) {
        //List<String> list = stream2.filter(s -> s.equals("ates")).collect(Collectors.toList());

        stream2.filter(s -> s.contains("ib")).forEach(System.out::println);

    }


    public static void mapMethod(Stream<String> stream3) {


        stream3.filter(s -> s.contains("a")).map(String::toUpperCase).forEach(System.out::println);

    }


    public static void sortedMethod(Stream<String> stream3) {


        stream3.filter(s -> s.contains("a")).map(String::toUpperCase).sorted().forEach(System.out::println);

    }


    public static void matchMethod(Stream<String> stream3) {

        boolean matchResult = stream3.anyMatch(s -> s.contains("a"));

        System.out.println("match result :" + matchResult);

    }


    public static void countMethod(Stream<String> stream3) {

        long totalMatch = stream3.filter(s -> s.contains("x")).count();

        System.out.println("total match :" + totalMatch);

    }


    public static void reduceMethod() {

        List<String> memberName = new ArrayList<>();

        memberName.add("ibrahim");
        memberName.add("ates");

        Optional<String> reduced = memberName.stream().reduce((s1, s2) -> s1 + " # " + s2);

        reduced.ifPresent(System.out::println);


    }


    public static void main(String[] args) {

        Stream<String> stream = Stream.of("ibrahim", "ates", "halil");

        //forEachMethod(stream);

        //filterMethod(stream);

        //mapMethod(stream);

        //sortedMethod(stream);

        //matchMethod(stream);

        //countMethod(stream);

        double val = 0.123456;
        String formatted = String.valueOf(Math.round(val * 100) / 100D);
        System.out.println(formatted);

        //List<Integer> integers = Arrays.asList(-1, 0, 1, 2, 3, 4, 5);


       //integers.stream()
        //        .filter(i->i>2 && i<4).forEach(System.out::println);

        //reduceMethod();


    }


}
