package amazon;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestCommonFactor {

    public static void main(String[] args) {
        int[] states = {2,4,5,8,10};
        System.out.println(generalizedGCD(5, states));

    }

    public static int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE

        List<Integer> cells = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(cells);
        int hcf=0;


        int index=0;
            for(int i = 1; i <= cells.get(0); i++) {

                index=0;
                while ( Math.abs(cells.get(index))%i == 0 && index<cells.size()-1)
                {
                    index++;
                }
                if(index==cells.size()-1) hcf = i;

            }


        return hcf;
    }
}
