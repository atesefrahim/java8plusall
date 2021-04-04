package soquestions;

import java.util.Arrays;

public class FindEvenIndex {
    public static void main(String[] args) {

        System.out.println(findEvenIndex(new int[] {20,10,-80,10,10,15,35}));
    }
    public static int findEvenIndex(int[] arr) {

        int beforeSum=0;
        int afterSum=0;
        int temp=0;
        for(int index=0;index<arr.length;index++){
            if(index==0) beforeSum=0;
            else beforeSum=beforeSum+arr[index-1];
            temp=index+1;
            afterSum=0;
            while(temp<arr.length){
                afterSum=afterSum+arr[temp];
                temp++;
            }

            if(beforeSum==afterSum) return index;
        }

        return -1;
    }
    public static int findEvenIndex2(int[] arr) {

       int sumRight = Arrays.stream(arr).sum()-arr[0];
       int sumLeft=0;
       for(int i=1;i<arr.length;i++){
           sumLeft+=arr[i-1];
           sumRight-=arr[i];
           if(sumLeft==sumRight) return i;
       }
       return -1;
    }
}
