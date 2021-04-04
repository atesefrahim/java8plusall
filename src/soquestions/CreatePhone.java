package soquestions;

public class CreatePhone {
    public static void main(String[] args) {

    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!

        String phoneFormat = "(";
        for (int indis : numbers) {
            phoneFormat = phoneFormat + indis;
            if (phoneFormat.length() == 4) phoneFormat = phoneFormat + ") ";
            else if (phoneFormat.length() == 9) phoneFormat = phoneFormat + "-";

        }
        return phoneFormat;
    }
}
