package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumTime {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(8);
        System.out.println(minimumTime(5,list));
    }

    static int minimumTime(int numOfParts, List<Integer> parts)
    {
        // WRITE YOUR CODE HERE

        List<Integer> newList = new ArrayList<>();
        newList.addAll(parts);

        int sum=0,i=0;

        if(newList.size()==1) sum=newList.get(i);
        while(newList.size()>1){

            Collections.sort(newList);

            sum = sum+newList.get(i)+newList.get(i+1);

            newList.set(0,newList.get(i)+newList.get(i+1));

            newList.remove(1);

        }
        return sum;
    }
}
