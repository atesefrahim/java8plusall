package streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class ConvertArrayToStream {

    public static <T> Stream<T> convertArrayToStream(T arr[]) {

        //return Arrays.stream(arr);

        // or we use stream.of
        //return Stream.of(arr);

        // or we use List.stream
        return Arrays.asList(arr).stream();


    }

    public static void main(String[] args) {

        String arr[] = {"ibrahim", "ates"};

        System.out.println("Array :" + Arrays.toString(arr));

        Stream<String> stream = convertArrayToStream(arr);

        Iterator<String> it = stream.iterator();

        System.out.println("After cnvert to stream :");

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }


        Integer arrInt[] = {1, 5, 8, 9};
        Stream<Integer> streamInt = convertArrayToStream(arrInt);
        streamInt.
            filter(e->e>5).
            map(e->e+8).
            forEach(System.out::println);

        Object objArr[] = {"a", "b"};
        Stream<Object> streamObj = convertArrayToStream(objArr);
        streamObj.forEach(System.out::println);

    }
}
