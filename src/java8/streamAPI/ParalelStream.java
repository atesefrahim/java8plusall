package java8.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParalelStream {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<10; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> nums = parallelStream.filter(num -> num > 5);
        //using lambda in forEach
        nums.forEach(n -> System.out.println("parallel="+n));

        Stream<Integer> seqN = sequentialStream.filter(p -> p > 5);

        seqN.forEach(p -> System.out.println("sequential="+p));

    }

}
