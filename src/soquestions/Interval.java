package soquestions;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Interval {
    public static void main(String[] args) {

        //System.out.println(sumIntervals3(new int[][]{{-9811, 3658}, {-9714, -4359}, {-9705, -6234}, {-8711, -1824}, {-6851, -3358}, {-6807, 7915}, {-6573, -3236}, {-6477, -2722}, {-6328, 9096}, {-6215, 7802}, {-5846, 1309}, {-5795, 8804}, {-5738, 2502}, {-5454, 5350}, {-5109, 6782}, {-4578, 9620}, {-3883, 9469}, {-2617, 4275}, {405, 8796}, {3075, 9742}, {3108, 9339}, {3901, 8447}, {3915, 5637}, {4028, 7577}, {4129, 5812}, {6447, 8488}}));
        System.out.println(sumIntervals3(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
    }

    public static int sumIntervals(int[][] intervals) {


        if(intervals==null || intervals.length<1) return 0;

        java.util.Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));


        int diff=0, max=0, holdIndex=0;

        for (int i=0;i<intervals.length;i++)
        {

            holdIndex=i;
            max=intervals[i][1];
            while(i<intervals.length&&intervals[holdIndex][1]>=intervals[i][0])
            {
               i++;
            }
            //if(max>intervals[i][1]) diff=diff+max-intervals[holdIndex][0];
            //else

            diff=diff+intervals[i][1]-intervals[holdIndex][0];

        }
        return diff;

    }

    public static int sumIntervals2(int[][] intervals) {
        return intervals == null ? 0 : (int) Arrays.stream(intervals)
                .flatMapToInt(interval -> IntStream.range(interval[0], interval[1]))
                .distinct()
                .count();
    }

    public static int sumIntervals3(int[][] intervals) {
        if (intervals == null) return 0;
        else if (intervals.length == 0) return 0;
        else if (intervals[0].length == 0) return 0;
        java.util.Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int sum = 0, min = intervals[0][0], max = intervals[0][1];
        for (int[] interval : intervals) {
            if (min < interval[0] && max >= interval[0]) {
                if (max < interval[1]) max = interval[1];
            } else if (max < interval[0]) {
                sum += (max - min);
                min = interval[0];
                max = interval[1];
            }
        }
        sum += (max - min);
        return sum;
    }
}
