package java8.collectionAPI;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

    public static void main(String[] args) throws NumberFormatException {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);


        countSubarrays(numbers, 4);
    }

    public static long countSubarrays(List<Integer> numbers, int k) {
        // Write your code here

        int counts = 0;
        int[] numArr = numbers.stream().mapToInt(element->element).toArray();
        int length = numArr.length;
        int i=0;
        while(i<length){

            int count = 0;

            while(i < length && numArr[i] <= k){
                i++;
                count++;
            }

            counts += ((count * (count + 1) / 2));
        }

        return (length * (length + 1) / 2 - counts);

    }

}
