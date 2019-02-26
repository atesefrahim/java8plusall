package kataquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Following quiz is given by Oracle

public class GenericChallenge1 {

    public static void main(String... args) {

        List<String> fResult = GenericChallenge1.<String>get(new ArrayList<>(), new String("1"));

        List<Object> sResult = GenericChallenge1.get("ibrahim", Double.valueOf(12));

        Stream<Object> stream = Stream.concat(fResult.stream(), sResult.stream());

        stream.forEach(System.out::println);
    }

    public static <T> List<T> get(List<T> list, T t){
        list.add(t);
        return list;
    }

    public static <T, R extends T> List<T> get(T type1, R type2){
        List<T> list = new ArrayList<>();
        list.add(type1);
        list.add(type2);
        return list;
    }
}
