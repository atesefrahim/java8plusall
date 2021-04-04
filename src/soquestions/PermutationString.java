package soquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermutationString {
    public static HashSet<String> hs = new HashSet<>();

    public static void main(String[] args) {

        hs.clear();
        permutation("", "ab");
        System.out.println(hs);

    }

    public static List<String> singlePermutations(String s) {
        // Your code here!
        char[] charStr = s.toCharArray();

        char temp;
        HashSet<String> hashSet = new HashSet<>();

        for (int index = 0; index < charStr.length; index++) {

            charStr = s.toCharArray();
            for (int index2 = 0; index2 < charStr.length; index2++) {
                temp = charStr[index2];
                charStr[index2] = charStr[index];
                charStr[index] = temp;
                hashSet.add(String.valueOf(charStr));

            }

        }

        return new ArrayList<String>(hashSet);
    }


    private static void permutation(String prefix, String str) {


        int n = str.length();
        if (n == 0) {
            hs.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    static void printAllKLength(char[] set, int k) {
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }

    // The main recursive method
// to print all possible
// strings of length k
    static void printAllKLengthRec(char[] set,
                                   String prefix,
                                   int n, int k) {

        // Base case: k is 0,
        // print prefix
        if (k == 0) {
            System.out.println(prefix);
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {

            // Next character of input added
            String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix,
                    n, k - 1);
        }
    }


    public static int maxInt(int input) {
        int result;
        if (input == 1) {
            return 1;
        }
        // here we are calling the recursion function
        result = maxInt(input - 1) * input;
        return result;
    }
}
