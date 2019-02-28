package soquestions;

public class SuperMarketQueue {
    public static void main(String[] args) {

        System.out.println(solveSuperMarketQueue2(new int[] { 6,6,2,2,2,1,1,4,7,7,6,5}, 4));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] registers = new int[n];
        for(int i : customers) {
            registers[smallestIndex(registers)] += i;
        }
        return registers[biggestIndex(registers)];
    }

    public static int smallestIndex(int[] arr) {
        int smallestIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[smallestIndex] > arr[i])
                smallestIndex = i;
        }
        return smallestIndex;
    }

    public static int biggestIndex(int[] arr) {
        int biggestIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[biggestIndex] < arr[i])
                biggestIndex = i;
        }
        return biggestIndex;
    }

    public static int solveSuperMarketQueue2(int[] customers, int n) {
        int[] resultCustomer = new int[n];
        for(int customer:customers)
        {
            resultCustomer[smallest(resultCustomer)] += customer;
        }
        return resultCustomer[biggest(resultCustomer)];
    }
    public static int smallest(int[] result)
    {
        int smallIndex=0;
        for(int i=0;i<result.length;i++){
            if(result[smallIndex] > result[i]) smallIndex=i;
        }
        return smallIndex;

    }
    public static int biggest(int[] result)
    {
        int bigIndex=0;
        for(int i=0;i<result.length;i++){
            if(result[bigIndex] < result[i]) bigIndex=i;
        }
        return bigIndex;

    }
}
