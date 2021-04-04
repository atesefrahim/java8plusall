package java8.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {

        /*
        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0),m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
        */

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // Write your code here.
        String regex = "[A-Za-z !,?._'@]+";

        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher m = p.matcher(s);

        s.matches(regex);

        String[] arrayStr = s.split(regex);

        List<String> ast = new ArrayList<>();
        // Check for subsequences of input that match the compiled pattern
        while (m.find()) {
            ast.add(m.group());
            System.out.println(m.group());
        }

        in.close();
    }
}
