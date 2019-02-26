package kataquestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverseWordsMethod2("ehT kciuq nworb xof spmuj revo eht yzal .god"));
    }
    public static String reverseWords(final String original)
    {
        // Have at it

        if(original.length()>0&&original.isBlank()) return original;

        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder reverseItem = new StringBuilder();
        String[] array = original.split(" ");
        int count=0;
        for(String item:array)
        {
            count++;
            if(count>1&&count<array.length+1) stringBuilder.append(" ");
            reverseItem.append(item);
            stringBuilder.append(reverseItem.reverse().toString());
            reverseItem.delete(0,item.length());
        }

        return stringBuilder.toString();
    }

    public static String reverseWordsMethod2(final String original)
    {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    }

}
