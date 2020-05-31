package soquestions;

public class TicketBill {
    public static void main(String[] args) {
        System.out.println(tickets(new int[]{25, 50, 50, 100}));
    }

    public static String tickets(int[] people) {
        //Your code is here...
        int pocket_25 = 0;
        int pocket_50 = 0;
        String flag = "NO";
        for (int index = 0; index < people.length; index++) {
            if (index == 0 && people[0] != 25) {
                return "NO";
            } else {
                if (people[index] == 25) {
                    pocket_25 = pocket_25 + 1;

                    flag = "YES";
                } else if (people[index] == 50 && pocket_25 > 0) {
                    pocket_50 = pocket_50 + 1;
                    pocket_25 = pocket_25 - 1;
                    flag = "YES";
                } else if ((people[index] == 100 && pocket_25 > 0 && pocket_50 > 0) || (people[index] == 100 && pocket_25 > 2)) {
                    pocket_50--;
                    pocket_25--;
                    flag = "YES";
                } else flag = "NO";

            }
        }
        return flag;
    }
}

