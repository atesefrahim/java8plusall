package java8.string;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean pl = false;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) == A.charAt(A.length()-1 - i)) pl = true;
            else {
                pl = false;
                break;
            }
        }
        if (pl) System.out.print("Yes");
        else System.out.print("No");

    }
}
