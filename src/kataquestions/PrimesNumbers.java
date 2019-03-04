package soquestions;

import java.util.*;

public class PrimesNumbers {

    private static Map<Integer, Integer> allList = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(factors2(364));
    }

    public static String factors(int n) {
        // your code
        for(int i=2;i<=n/2;i++){
            getPrimes(n, i);
        }

        Map<Integer, Integer> result2 = new LinkedHashMap<>();

        allList.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

        String result="";

        for (Map.Entry<Integer, Integer> entry : result2.entrySet()) {

            if(entry.getValue()>1)
            {
                result = result+"("+entry.getKey()+"**"+entry.getValue()+")";
            }
            else result=result+ "("+entry.getKey()+")";
        }
        if (result.isEmpty()) result="("+n+")";

        allList.clear();
        return result;
    }

    public static Map<Integer,Integer> getPrimes(int n, int divide)
    {
        int count=0;
        while(n%divide==0)
        {
            if(isPrime(divide)) {
                count = allList.containsKey(divide) ? allList.get(divide) : 0;

                allList.put(divide, count + 1);
            }
            n=n/divide;
        }

        return allList;

    }

    public static boolean isPrime(int num)
    {

        if (num==2) return true;
        int i=2;
        while(i<num)
        {
            if(num%i==0 && i!=num) return false;
            i++;
        }
        return true;
    }

    public static String factors2(int lst) {
        String result = "";
        for (int fac = 2; fac <= lst; ++fac) {
            int count;
            for (count = 0; lst % fac == 0; ++count) {
                lst /= fac;
            }
            if (count > 0) {
                result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
            }
        }
        return result;
    }
}
