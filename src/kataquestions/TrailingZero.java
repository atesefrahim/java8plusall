package soquestions;



public class TrailingZero {

    public static void main(String[] args) {
        System.out.println(zeros(10000));


        String def = "ATCAG";

        char tempChar = 'T';
        String abc="";
        char[] charArray = def.toCharArray();
        for (char inChar : charArray) {

            switch (inChar) {
                case 'A':
                    abc = abc+"T";
                    break;
                case ('T'):
                    abc = abc+"A";
                    break;
                case ('G'):
                    abc = abc+"C";
                    break;
                case ('C'):
                    abc = abc+"G";
                    break;

            }
        }

        def=charArray.toString();
        System.out.println(abc);
    }
        public static int zeros ( int n){
            // your beatiful code here
          /*   Long result = 1L;
            int count = 0;
       if(n>0)
        {
            result=Long.valueOf(
                    LongStream.range(1, n + 1).reduce((previous, current) -> previous * current).getAsLong());

            while(result%10==0)
            {
                count++;
                result=result/10;
            }
        }*/

            int res = 0;
            for (int i = 5; i <= n; i *= 5) {
                res += n / i;
            }
            return res;
        }
    }
