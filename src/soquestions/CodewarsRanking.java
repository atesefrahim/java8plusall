package soquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CodewarsRanking {


    public static void main(String[] args) {


        User user1 = new User();
        user1.setRank(-8);
        user1.setProgress(0);


        System.out.println(user1.rank());
        System.out.println(user1.progress());


        user1.incProgress(-8);
        System.out.println(user1.progress());
        System.out.println(user1.rank());
        user1.incProgress(-8);
        System.out.println(user1.progress());
        System.out.println(user1.rank());
        user1.incProgress(-8);
        System.out.println(user1.progress());
        System.out.println(user1.rank());

    }


}

class User {

    static List<Integer> ranks = new ArrayList<>(Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8));

    private static int rank;

    private static int progress;

    public static void setRank(int rank) {
        User.rank = rank;
    }

    public static void setProgress(int progress) {
        User.progress = progress;
    }

    public static int rank() {
        return rank;
    }

    public static int progress() {
        return progress;
    }

    public static int incProgress(int inputRank) throws IllegalArgumentException {
        if (!ranks.contains(inputRank)) throw new IllegalArgumentException("Invalid rank");

        int diff = IntStream.range(0, ranks.size())
                .filter(x -> inputRank == ranks.get(x))
                .findFirst()
                .orElse(0);

        diff = diff - IntStream.range(0, ranks.size())
                .filter(x -> rank == ranks.get(x))
                .findFirst()
                .orElse(0);

        calcProgress(diff, inputRank);

        return progress;
    }

    public static void calcProgress(int diff, int input) {
        boolean flag = false;
        if (diff > 0 || progress == 100) {
            progress = progress + 10 * (diff * diff);
            if (rank < 0) flag = true;
            setRank(rank + progress / 100);
            if (rank >= 0 && rank <= 8) setRank(rank + 1);
            else if (rank > 8) setRank(8);

            if (progress % 100 >= 0) setProgress(progress - (progress / 100) * 100);

        }
    }
}