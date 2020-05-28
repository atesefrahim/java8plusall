package amazon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CellComplete {


    public static void main(String[] args) {

        int[] states = {1,1,1,0,1,1,1,1};
        System.out.println(cellCompete(states, 2));

    }

    public static List<Integer> cellCompete(int[] states, int days)
    {

        int[] next = new int[states.length];
        int[] states2 = new int[states.length];

        for (int x=0;x<states.length;x++)
        {
            states2[x]=states[x];
        }

        for(int i=0; i<days; i++)
        {
            if(i>0) states2=next;

            for(int j=0;j<states2.length;j++){

                if(j==0 || j==states2.length-1)
                {
                    next[j]=0;
                }
                else
                {
                   if(states2[j-1] == states2[j+1])
                   {
                        next[j]=0;
                    }
                    else next[j]=1;
                }
            }
        }

        List<Integer> cells = Arrays.stream(next).boxed().collect(Collectors.toList());

        return cells;

    }
}
