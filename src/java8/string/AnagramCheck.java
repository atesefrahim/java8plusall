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
        // Complete the function
        if(a.length()!=b.length()) return false;


        char[] listA = a.toUpperCase().toCharArray();

        char[] listB = b.toUpperCase().toCharArray();

        char temp ;

        char temp2 ;


        for(int i =0; i<a.length(); i++){

            for(int y =i; y<a.length(); y++){

                if(listA[i]>=listA[y]) {
                    temp = listA[i];
                    listA[i] = listA[y];
                    listA[y] = temp;

                }

                if(listB[i]>=listB[y]) {
                    temp2 = listB[i];
                    listB[i] = listB[y];
                    listB[y] = temp2;

                }
            }
        }

        for(int x=0;x<listA.length;x++)
        {
            if(listA[x]!=listB[x]) return false;
        }
        return true;
    }
}
