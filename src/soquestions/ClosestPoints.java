package soquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class ClosestPoints {
    static Integer val = 0;
    static int x = 0, y = 0;

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(7, 2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(1, -1));

        List<Integer> xCord = new ArrayList<>();
        xCord.add(1);
        xCord.add(3);
        xCord.add(7);
        xCord.add(2);
        xCord.add(1);
        List<Integer> yCord = new ArrayList<>();
        yCord.add(2);
        yCord.add(4);
        yCord.add(-1);
        yCord.add(3);
        yCord.add(0);



        System.out.println(closestXDestinations(xCord, yCord));

    }

    public static long closestXDestinations(List<Integer> x, List<Integer> y) {

        long closest = new Double(Math.pow(x.get(1)-x.get(0), 2) + Math.pow(y.get(1)-y.get(0), 2)).longValue();

        for (int i = 1; i < x.size(); i++) {
            for(int a=0; a<i; a++){
                long indexValue = new Double(Math.pow(x.get(i)-x.get(a), 2) + Math.pow(y.get(i)-y.get(a), 2)).longValue();
                if(indexValue < closest){
                    closest = indexValue;
                }
            }

        }

        return closest;
    }
}
