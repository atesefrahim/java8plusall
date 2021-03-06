package java8.regex;

import java.util.Scanner;

public class UsernameValidator {
    private static final Scanner scan = new Scanner(System.in);
    private static String regularExpression = "^[aA-zZ]\\w{7,29}$";

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
