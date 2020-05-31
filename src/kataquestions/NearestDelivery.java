package soquestions;

import java.util.*;

public class NearestDelivery {
    static Integer val = 0;
    static int x = 0, y = 0;

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(7, 2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(1, -1));


        System.out.println(closestXDestinations(3, list, 1));

    }

    public static List<List<Integer>> closestXDestinations(int numDestinations,
                                                           List<List<Integer>> allLocations, int numDeliveries) {
        TreeMap<Double, List<Integer>> sortedMap = new TreeMap<>();
        for (int i = 0; i < allLocations.size(); i++) {
            List<Integer> list = allLocations.get(i);
            if (!list.isEmpty()) {
                if (list.size() == 1) {
                    x = ((Integer) list.get(0)).intValue();
                    y = 0;
                } else if (list.size() == 2) {
                    x = ((Integer) list.get(0)).intValue();
                    y = ((Integer) list.get(1)).intValue();
                }

                val = x * x + y * y;
                double dVal = Math.sqrt(val);
                sortedMap.put(dVal, list);
            }
        }
        ArrayList<List<Integer>> as = new ArrayList<>(sortedMap.values());
        while (as.size() > numDeliveries) {
            as.remove(as.size() - 1);
        }
        return as;
    }
}
