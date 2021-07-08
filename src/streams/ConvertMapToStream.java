package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ConvertMapToStream {

    public static <K, V> Stream<Map.Entry<K, V>> convertMapToStream(Map<K, V> map) {
        return map.entrySet().stream();
    }

    public static <K, V> Stream<K> convertMapKeyToStream(Map<K, V> map) {
        return map.keySet().stream();
    }

    public static <K, V> Stream<V> convertMapValueToStream(Map<K, V> map) {
        return map.values().stream();
    }


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "asd");
        map.put(2, "adasda");
        map.put(3, "asaf");

        Stream<Map.Entry<Integer, String>> mapStream = map.entrySet().stream();

        System.out.println("Stream of key value1 :" + Arrays.toString(mapStream.toArray()));


        Stream<Map.Entry<Integer, String>> stream = convertMapToStream(map);

        System.out.println("Stream of key value :" + Arrays.toString(stream.toArray()));


        Stream<Integer> streamKey = convertMapKeyToStream(map);

        System.out.println("Stream of key :" + Arrays.toString(streamKey.toArray()));


        Stream<String> streamValues = convertMapValueToStream(map);

        System.out.println("Stream of value :" + Arrays.toString(streamValues.toArray()));
    }


}
