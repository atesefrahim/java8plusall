package soquestions;


public class DiceGame {
    public static void main(String[] args) {


        System.out.println(greedy2(new int[]{2, 4, 4, 5, 4}));
    }

    public static int greedy(int[] dice) {
        //code here

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, score = 0;
        for (int number : dice) {
            if (number == 1) num1++;
            else if (number == 2) num2++;
            else if (number == 3) num3++;
            else if (number == 4) num4++;
            else if (number == 5) num5++;
            else if (number == 6) num6++;
        }
        if (num1 >= 3) score = 1000 + num5 * 50 + (num1 - 3) * 100;
        else if (num2 >= 3) score = 200 + num5 * 50 + (num1) * 100;
        else if (num3 >= 3) score = 300 + num5 * 50 + (num1) * 100;
        else if (num4 >= 3) score = 400 + num5 * 50 + (num1) * 100;
        else if (num5 >= 3) score = 500 + (num5 - 3) * 50 + (num1) * 100;
        else if (num6 >= 3) score = 600 + num5 * 50 + (num1) * 100;
        else score = num1 * 100 + num5 * 50;

        return score;
    }

    public static int greedy2(int[] dice) {
        int n[] = new int[7];
        for (int d : dice) {
            n[d]++;
        }
        return n[1] / 3 * 1000 + n[1] % 3 * 100 + n[2] / 3 * 200 + n[3] / 3 * 300 + n[4] / 3 * 400 + n[5] / 3 * 500 + n[5] % 3 * 50 + n[6] / 3 * 600;
    }
}
