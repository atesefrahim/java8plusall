package soquestions;

import java.util.*;
import java.util.stream.Collectors;

public class MoleculetoAtoms {

    public static void main(String[] args) {

        System.out.println(getAtoms("K4[ON(SO3)2]2"));

    }

    public static Map<String, Integer> getAtoms(String formula) {
        // Your code here!
        Boolean finished = true;
        int index = 0, digit = 0;

        StringBuilder stringBuilderBr2 = new StringBuilder();
        Map<String, Integer> angelList = new LinkedHashMap<>();
        Map<String, Integer> paranthesisList = new LinkedHashMap<>();
        Map<String, Integer> mList2 = new LinkedHashMap<>();
        Map<String, Integer> mList = new LinkedHashMap<>();
        int before = 0, i = 0;

        while (i < formula.length()) {
            if (formula.substring(i, i + 1).equals("[")) {
                before = i;
                while (!formula.substring(i, i + 1).equals("]")) {
                    i++;
                }

                angelList = getAngelIn(formula.substring(before + 1, i));
                if (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) {
                    i++;
                    stringBuilderBr2.append(formula.charAt(i));
                    final int digit2 = Integer.valueOf(stringBuilderBr2.toString());
                    stringBuilderBr2.delete(0, stringBuilderBr2.toString().length());

                    angelList.replaceAll((k, v) -> {
                        return v * digit2;

                    });
                    i++;

                }

            } else if (formula.substring(i, i + 1).equals("(")) {
                before = i;

                while (!formula.substring(i, i + 1).equals(")")) {
                    i++;
                }
                paranthesisList = getParanthesisIn(formula.substring(before, i + 1));
            } else {
                before = i;
                while (Character.isLetterOrDigit(formula.charAt(i))) {
                    i++;
                }
                mList2 = getParanthesisIn(formula.substring(before, i));
            }

        }


        mList.putAll(mList2);
        //Merge maps
        angelList.forEach(
                (key, value) -> mList.merge(key, value, (v1, v2) -> v1 == (v2) ? v1 : v1 + v2)
        );

        paranthesisList.forEach(
                (key, value) -> mList.merge(key, value, (v1, v2) -> v1 == (v2) ? v1 : v1 + v2)
        );

        return mList;
    }

    public static Map<String, Integer> getAngelIn(String pIn) {

        Boolean finished = true;
        int index = 0, digit = 0;
        StringBuilder stringBuilderBr = new StringBuilder();
        StringBuilder stringBuilderBr2 = new StringBuilder();
        Map<String, Integer> mList = new LinkedHashMap<>();
        Map<String, Integer> angelList = new LinkedHashMap<>();

        int before = 0;
        while (finished && index < pIn.length()) {
            if (pIn.charAt(index) == ']') finished = false;
            else {

                digit = 1;
                if (pIn.charAt(index) == '(') {
                    before = index;
                    while (!pIn.substring(index, index + 1).equals(")")) {
                        index++;
                    }
                    angelList = getParanthesisIn(pIn.substring(before, index + 1));
                    if (index + 1 < pIn.length() && Character.isDigit(pIn.charAt(index + 1))) {
                        index++;
                        stringBuilderBr2.append(pIn.charAt(index));
                        final int digit2 = Integer.valueOf(stringBuilderBr2.toString());
                        stringBuilderBr2.delete(0, stringBuilderBr2.toString().length());

                        angelList.replaceAll((k, v) -> {
                            return v * digit2;

                        });
                        index++;

                    }
                }
                if (index < pIn.length() && Character.isUpperCase(pIn.charAt(index))) {
                    stringBuilderBr.append(pIn.charAt(index));
                    index++;

                }
                if (index < pIn.length() && Character.isLowerCase(pIn.charAt(index))) {
                    stringBuilderBr.append(pIn.charAt(index));
                    index++;

                }

                if (index < pIn.length() && Character.isDigit(pIn.charAt(index))) {
                    stringBuilderBr2.append(pIn.charAt(index));
                    digit = Integer.valueOf(stringBuilderBr2.toString());
                    stringBuilderBr2.delete(0, stringBuilderBr2.toString().length());
                    index++;
                }

                //else if (index<pIn.length()&&!(Character.isLetterOrDigit(pIn.charAt(index))))index++;

                if (!stringBuilderBr.toString().isEmpty()) {
                    mList.put(stringBuilderBr.toString(), digit);
                    stringBuilderBr.delete(0, stringBuilderBr.toString().length());
                }

            }

        }

        //Merge maps
        angelList.forEach(
                (key, value) -> mList.merge(key, value, (v1, v2) -> v1 == (v2) ? v1 : v1 + v2)
        );

        return mList;

    }


    public static Map<String, Integer> getParanthesisIn(String pIn) {

        Boolean finished = true;
        int index = 0, digit = 0;
        StringBuilder stringBuilderBr = new StringBuilder();
        StringBuilder stringBuilderBr2 = new StringBuilder();
        Map<String, Integer> mList = new LinkedHashMap<>();
        while (finished && index < pIn.length()) {
            if (pIn.charAt(index) == ')') finished = false;
            else {

                digit = 1;
                if (Character.isUpperCase(pIn.charAt(index))) {
                    stringBuilderBr.append(pIn.charAt(index));
                    index++;

                }
                if (index < pIn.length() && Character.isLowerCase(pIn.charAt(index))) {
                    stringBuilderBr.append(pIn.charAt(index));
                    index++;

                }

                if (index < pIn.length() && Character.isDigit(pIn.charAt(index))) {
                    stringBuilderBr2.append(pIn.charAt(index));
                    digit = Integer.valueOf(stringBuilderBr2.toString());
                    stringBuilderBr2.delete(0, stringBuilderBr2.toString().length());
                    index++;
                } else if (index < pIn.length() && !(Character.isLetterOrDigit(pIn.charAt(index)))) index++;

                if (!stringBuilderBr.toString().isEmpty()) {
                    mList.put(stringBuilderBr.toString(), digit);
                    stringBuilderBr.delete(0, stringBuilderBr.toString().length());
                }

            }

        }

        return mList;
    }
}
