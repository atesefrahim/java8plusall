package java8.string;

import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {

        if(a.length()!=b.length()) return false;

        char[] listA = a.toUpperCase().toCharArray();

        char[] listB = b.toUpperCase().toCharArray();

        for(int x = 0; x<a.length(); x++){
            if(listA[x]!=listB[a.length()-x-1])
                return false;
        }

        return true;
    }

}
