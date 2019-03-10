package java8.lambdaexpression;

public class RangeExtraction {

    public static void main(String[] args) {

        System.out.println(rangeExtraction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
    }

    public static String rangeExtraction(int[] arr) {

        int size = 1;
        String str=String.valueOf(arr[0]);
        String sq="";

        boolean last = false;

        while(size<arr.length-1)
        {
            if(arr[size+1]-arr[size]==1)
            {
                if (sq.length()== 0) sq=String.valueOf(arr[size]);
                if(size+1==arr.length) last=true;
            }
            else
            {
                if(str.length()>0)
                {
                    if (sq.length()> 0)  str=str+"," +sq+"-" +arr[size];
                    else str=str + "," + String.valueOf(arr[size]);
                }
                else
                {
                    if (sq.length()> 0)  str=sq+"-" +arr[size];
                    else str=String.valueOf(arr[size]);

                }
                if (last)
                {
                    if (sq.length()> 0)  str=str+"," +sq+"-" +arr[size];
                    else str=str + "," + String.valueOf(arr[size]);
                }
            }
            size++;

        }
        return str;
    }
}
