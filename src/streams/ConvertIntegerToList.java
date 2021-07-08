package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertIntegerToList {

    public static <T, U> List<U>
    convertIntListToStringList(List<T> listOfInteger,
                               Function<T, U> function)
    {
        return listOfInteger.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Create a List of Integer
        List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5);

        // Print the List of Integer
        System.out.println("List of Integer: " + listOfInteger);

        List<String> strList = listOfInteger.stream().map(e->String.valueOf(e)).collect(Collectors.toList());

        System.out.println("List of String: " + strList);

        // Convert List of Integer to List of String
        List<String> listOfString = convertIntListToStringList(
                listOfInteger,
                s -> String.valueOf(s));

        // Print the List of String
        System.out.println("List of String: " + listOfString);
    }

}
