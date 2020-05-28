package amazon;

import java.util.*;

public class LengthSubsequenceShoppers {

    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a');
        System.out.println(lengthSubsequenceShoppers(list));
    }

    static List<Integer> lengthSubsequenceShoppers(List<Character> inputList)
    {
        // WRITE YOUR CODE HERE
        List<Integer> list = new ArrayList<>();

        final int n; // the size of array
        // read n and the array
        final List<Character> arr=new ArrayList<Character>();
        Map<Character, Integer> cur = new TreeMap<Character, Integer>();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        int distinctcount=0;
        for (final Character integer : arr)
        {
            if(cur.get(integer)==null)
            {
                cur.put(integer, 1);
                ++distinctcount;
            }else
            {
                cur.put(integer,cur.get(integer)+1);
            }
        }

        // now k is the number of distinct elements
        cur=new TreeMap<Character, Integer>();
        //   memset( cur, 0, sizeof( cur )); // we need this array anew
        int begin = 0, end = -1; // to make it 0 after first increment
        int best = -1; // best answer currently found
        int ansbegin = 0, ansend = 0; // interval of the best answer currently found
        int cnt = 0; // distinct elements in current subsequence
        final int inpsize = arr.size();
        while(true)
        {
            if( cnt < distinctcount )
            {
                ++end;
                if (end == inpsize) {
                    break;
                }
                if( cur.get(arr.get(end)) == null ) {
                    ++cnt;
                    cur.put(arr.get(end), 1);
                } // this elements wasn't present in current subsequence;
                else
                {
                    cur.put(arr.get(end),cur.get(arr.get(end))+1);
                }
                continue;
            }
            // if we're here it means that [begin, end] interval contains all distinct elements
            // try to shrink it from behind
            while (cur.get(arr.get(begin)) != null && cur.get(arr.get(begin)) > 1) // we have another such element later in the subsequence
            {
                cur.put(arr.get(begin),cur.get(arr.get(begin))-1);
                ++begin;
            }
            // now, compare [begin, end] with the best answer found yet
            if( best == -1 || end - begin < best )
            {
                best = end - begin;
                ansbegin = begin;
                ansend = end;
            }
            // now increment the begin iterator to make cur < k and begin increasing the end iterator again
            if (cur.get(arr.get(begin)) != null) {
                cur.put(arr.get(begin),cur.get(arr.get(begin))-1);
            }
            ++begin;
            --cnt;
        }

        // output the [ansbegin, ansend] interval as it's the answer to the problem
        System.out.println(ansbegin+"--->"+ansend);
        for( int i = ansbegin; i <= ansend; ++i ) {
            System.out.println(arr.get(i));
        }
        return list;
    }
}
