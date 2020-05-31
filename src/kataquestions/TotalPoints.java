package soquestions;

public class TotalPoints {

    public static void main(String[] args) {

        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"}));
    }

    public static int points(String[] games) {
        //implement me
        String[] match = new String[2];
        int score = 0;
        for (String res : games) {
            match = res.split(":");
            if (Integer.valueOf(match[0]) > Integer.valueOf(match[1])) score += 3;
            else if (Integer.valueOf(match[0]) == Integer.valueOf(match[1])) score++;
        }
        return score;
    }
}
