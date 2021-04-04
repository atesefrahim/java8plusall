package soquestions;

import java.util.ArrayList;
import java.util.List;

public class TripleDouble {
    public static void main(String[] args) {

        System.out.println(TripleDouble(451999277L, 41177722866L));
    }

    public static int TripleDouble(Long num1, Long num2) {
        List<Long> numeric1 = new ArrayList<>();
        List<Long> numeric2 = new ArrayList<>();
        int i = 0;
        long pivot = 0l;
        while (num1 > 1) {
            numeric1.add(num1 % 10);
            num1 = num1 / 10;
        }

        i = 0;
        while (num2 > 1) {
            numeric2.add(num2 % 10);
            num2 = num2 / 10;
        }
        int count = 0;
        for (int x = 0; x < numeric1.size() - 1; x++) {
            if (numeric1.get(x) == numeric1.get(x + 1)) {

                if (pivot != numeric1.get(x)) count = 0;
                count++;
                pivot = numeric1.get(x);
            }
        }

        if (count > 0) count++;

        if (count == 3) {

            count = 0;
            for (int x = 0; x < numeric2.size() - 1; x++) {
                if (numeric2.get(x) == numeric2.get(x + 1) && (numeric2.get(x) == pivot)) {
                    count++;
                }
            }
            if (count > 0) count++;


            if (count == 2) return 1;

        }

        return 0;
    }

    public static int TripleDouble2(long num1, long num2) {

        if ((num1 + "").matches(".*(\\d)\\1{2,}.*") && (num2 + "").matches(".*(\\d)\\1{1,}.*")) {
            return 1;
        } else {
            return 0;
        }
    }
}
