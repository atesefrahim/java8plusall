package streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Syntax:

static <T> Stream<T> ofNullable(T t)
 */
public class CreateStreamsMethod {

    private static <T> void getStreamMethod1(List<T> list) {
        Stream<T> stream = list.stream();

        Iterator<T> it = stream.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + "\n");

        }
    }

    private static <T> void getStreamMethod2() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        stream.forEach(System.out::print);

        System.out.println("\n");

    }

    private static <T> void getStreamMethod3(T[] arr) {
        Stream<T> streamOfArray = Arrays.stream(arr);

        Iterator<T> it = streamOfArray.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


    private static void getStreamMethod4() {
        Stream<String> streamOfArray = Stream.empty();

        Iterator<String> it = streamOfArray.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


    private static void getStreamMethod5() {
        Stream.Builder<String> streamBuilder = Stream.builder();

        Stream<String> stream = streamBuilder.add("garanti").add("technology").build();


        Iterator<String> it = stream.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        list.add("ibrahim");
        list.add("halil");
        list.add("ates");

        /* create stream method 1
           using collection
         */
        System.out.println("Creation stream with method1");
        getStreamMethod1(list);

        /* create stream method 2
           from specified values
         */
        System.out.println("Creation stream with method2");
        getStreamMethod2();

        /* create stream method 3
           using array
         */
        System.out.println("Creation stream with method3");
        String[] array = new String[]{"ibrahim", "ates"};
        getStreamMethod3(array);


        /* create stream method 4
           stream.empty
         */
        System.out.println("Creation stream with method4");
        getStreamMethod4();


        /* create stream method 5
           stream builder
         */
        System.out.println("Creation stream with method5");
        getStreamMethod5();


        String str = "String to Char";

        List<Character> chars = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        System.out.println(chars);
    }
}
