package soquestions;

public class BiggerNumberSameDigits {
    public static void main(String[] args) {

        System.out.println(getBiggerNumber(144));
    }

    public static long getBiggerNumber(long n) {
        if (n <= 0) return n;
        else if (n / 10 == 0) return -1;
        long lastFx = 0, bLast = 0, num = 0;
        StringBuilder newNum = new StringBuilder();
        StringBuilder sameDigit = new StringBuilder();

        num = n;
        while (num % 10 > 0) {
            lastFx = num % 10;
            num = num / 10;
            bLast = num % 10;

            if (lastFx == bLast) {
                sameDigit.append(lastFx);
                sameDigit.append(lastFx);
            } else {
                newNum.append(bLast);
                if (sameDigit.length() > 0) newNum.append(sameDigit.toString());
                else newNum.append(lastFx);
                while (num > 0) {
                    num = num / 10;
                    newNum.append(num % 10);
                }

                break;
            }
        }

        if (newNum.toString().equals(String.valueOf(n))) return -1;
        else newNum = newNum.reverse();
        return Long.valueOf(newNum.toString());
    }

}
