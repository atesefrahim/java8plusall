package streams;

import java.util.stream.Stream;

public class StreamBuilder {

    public static void main(String[] args) {

        Stream.Builder<String> sb = Stream.builder();

        sb.add("ibrahim");
        sb.add("ates");

        sb.accept("halil");

        Stream<String> stream = sb.build();

        stream.forEach(System.out::println);

    }
}
