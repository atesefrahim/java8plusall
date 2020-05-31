package soquestions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        // TODO: this is your task ;)
        String returnStr = "";
        int ind = 0;
        int value = to.length() * 3;


        for (String word : words) {
            if (word.equalsIgnoreCase(to)) return word;
            else {
                ind = findMostSimilarIndex(word, to);

                if (ind < value) {
                    returnStr = word;
                    value = ind;
                }

                ind = findReverseMostSimilarIndex(word, to);
                if (ind < value) {
                    returnStr = word;
                    value = ind;
                }
                ind = findTwoSideMostSimilarIndex(word, to);

                if (ind < value) {
                    returnStr = word;
                    value = ind;
                }
            }
        }
        return returnStr;
    }

    public static Integer findMostSimilarIndex(String word, String contain) {
        int index = 1, value = word.length();
        String newWord = word;
        while (index < word.length()) {
            if (contain.contains(newWord)) {
                return word.length() - newWord.length();
            } else newWord = newWord.substring(1, newWord.length());
            index++;
        }
        return value;
    }

    public static Integer findReverseMostSimilarIndex(String word, String contain) {
        int index = 1, value = word.length();
        String newWord = word;
        while (index < word.length()) {
            if (contain.contains(newWord)) {

                return word.length() - newWord.length();
            } else newWord = newWord.substring(0, newWord.length() - 1);
            index++;
        }
        return value;
    }

    public static Integer findTwoSideMostSimilarIndex(String word, String contain) {
        int index = 1, value = word.length();
        String newWord = word;
        while (index < word.length()) {
            if (contain.contains(newWord)) {
                return word.length() - newWord.length();
            } else if (newWord.length() > 1) newWord = newWord.substring(1, newWord.length() - 1);
            index++;
        }
        return value;
    }

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});

        System.out.println("Did you mean: " + dictionary.findMostSimilar("heaven"));
        System.out.println("Did you mean: " + dictionary.findMostSimilar("javascript"));

    }


}
