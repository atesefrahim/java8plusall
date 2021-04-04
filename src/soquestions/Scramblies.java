package soquestions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;

public class Scramblies {
    public static void main(String[] args) {


        String str = "aabbcamaomsccddsasdasdartttttttttttttttttttttttttrtyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuudsadsadasedewqrewrwrwerwerwerwerwerwerwerwerwerwerwerwerwerwerwerwerwerwerwersdfdfsdgsdgsgsgsshshs";
        String str2 = "asdsdsıajdşnajnnnnnnnnnnnnaasdjjjjjjjjjjjjjjjjjjjjjjjjjjjjasdmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmsaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnerssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
        Long startTime = System.currentTimeMillis();
        System.out.println(scramble(str, str2));
        Long endTime = System.currentTimeMillis();
        System.out.println("diff1:" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        System.out.println(scramble2(str, str2));
        endTime = System.currentTimeMillis();
        System.out.println("diff2:" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        System.out.println(scramble3(str, str2));
        endTime = System.currentTimeMillis();
        System.out.println("diff3:" + (endTime - startTime));
    }

    public static boolean scramble(String str1, String str2) {

        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        String flag = "";
        for (char ch : charStr2) {
            int index = 0;
            while (index < charStr1.length) {
                if (ch == charStr1[index]) {
                    flag = "Y";
                    charStr1[index] = ':';
                    break;
                } else flag = "N";
                index++;
            }
            if (flag == "N") break;
        }
        if (flag == "Y") return true;
        else return false;


    }

    public static boolean scramble2(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (String s : str2.split("")) {
            if (!str1.contains(s)) return false;
            str1 = str1.replaceFirst(s, "");
        }

        return true;
    }

    public static boolean scramble3(String str1, String str2) {
        LinkedList<Character> linkedList = new LinkedList<Character>();
        for (char a : str1.toCharArray()) {
            linkedList.add(a);
        }
        for (char a : str2.toCharArray()) {
            if (!linkedList.remove((Character) a)) {
                return false;
            }
        }
        return true;
    }
}
