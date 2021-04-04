package soquestions;

public class HammingNumbers {

    static int maxDivide(int a, int b)
    {
        while(a % b == 0)
            a = a/b;
        return a;
    }

    static int getDivideResult(int no)
    {
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);

        return (no == 1)? 1 : 0;
    }

    static long hammingNumbers(int n)
    {
        int i = 1;
        int count = 1;
        while(n > count)
        {
            i++;
            if(getDivideResult(i) == 1)
                count++;
        }
        return i;
    }

    public static void main(String args[])
    {
        //long no = hammingNumbers(10000);
        //System.out.println(no);
        HammingNumbers hammingNumbers = new HammingNumbers();
        System.out.println(hammingNumbers.getHammingNo(1692));
    }

    long getHammingNo(int n)
    {
        long hamming[] = new long[n];
        long next_multiple_of_2 = 2;
        long next_multiple_of_3 = 3;
        long next_multiple_of_5 = 5;
        long next_hamming = 1;
        int i2 = 0, i3 = 0, i5 = 0;

        hamming[0] = 1;

        for(int i = 1; i < n; i++)
        {
            next_hamming = Math.min(next_multiple_of_2,
                    Math.min(next_multiple_of_3,
                            next_multiple_of_5));

            hamming[i] = next_hamming;
            if (next_hamming == next_multiple_of_2)
            {
                i2 = i2+1;
                next_multiple_of_2 = hamming[i2]*2;
            }
            if (next_hamming == next_multiple_of_3)
            {
                i3 = i3+1;
                next_multiple_of_3 = hamming[i3]*3;
            }
            if (next_hamming == next_multiple_of_5)
            {
                i5 = i5+1;
                next_multiple_of_5 = hamming[i5]*5;
            }
        }
        return next_hamming;
    }
}
