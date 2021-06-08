package com.ates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumThree {

  public static void main(String[] args) {

    int[] numbers = new int[]{-4,-2,1,-5,-4,-4,4,1,0,4,0,6,3,1,5,0};

    //System.out.println(findSumGivenValue(numbers, 0));
    System.out.println(findSumGivenValueAlternative2(numbers, 0));
  }

  public static List<List<Integer>> findSumGivenValue(int[] numbers, int givenVal){
    List<List<Integer>> returnList = new ArrayList<>();


    List<Integer> arrayTolist = Arrays.stream(numbers)     // IntStream
        .boxed()        // Stream<Integer>
        .collect(Collectors.toList());

    int[] listToArray = arrayTolist.stream().mapToInt(i->i).toArray();

    boolean addedBefore = false;



    for (int i = 0; i < numbers.length -2 ; i++) {

      for (int x = i+1; x < numbers.length -1 ; x++) {

        for (int y = x+1; y < numbers.length ; y++) {

          for (int a=0; a<returnList.size(); a++){
            int e1 = numbers[i];
            int e2 = numbers[x];
            int e3 = numbers[y];

            List<Integer> elements = new ArrayList<>();
            elements.add(numbers[i]);
            elements.add(numbers[x]);
            elements.add(numbers[y]);

            List<Integer> newList = returnList.get(a).stream()
                .filter(item -> !elements.contains(item))
                .collect(Collectors.toList());

            if(newList.size() == 0){
              addedBefore = true;
              break;
            } else addedBefore = false;
          }


          if(givenVal == numbers[i] + numbers[x] + numbers[y] && ! addedBefore){
            returnList.add(Arrays.stream(new int[]{numbers[i], numbers[x], numbers[y]})     // IntStream
                .boxed()        // Stream<Integer>
                .collect(Collectors.toList()));

          }

        }
      }

    }

    return  returnList;


  }

  public static List<List<Integer>> findSumGivenValueAlternative2(int[] nums, int givenVal){

    List<List<Integer>> triplets = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      if (i != 0 && nums[i] == nums[i - 1]) continue;

      int j = i + 1, k = nums.length - 1;

      while (j < k) {
        if (j != i + 1 && nums[j] == nums[j - 1]) {
          j++;
          continue;
        }

        if (k != nums.length - 1 && nums[k] == nums[k + 1]) {
          k--;
          continue;
        }

        int sum = nums[i] + nums[j] + nums[k];

        if (sum == 0) {
          triplets.add(Arrays.asList(nums[i], nums[j++], nums[k]));
        } else if (sum < 0) {
          j++;
        } else {
          k--;
        }
      }
    }

    return triplets;

  }

}
