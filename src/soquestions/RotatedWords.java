package com.ates;

import java.util.Arrays;
import java.util.List;

public class RotatedWords {

  public static void main(String[] args) {
    String input1 = "adaada";
    int input2 = 3;
    System.out.println(getRotatedOrNot(input1, input2));
  }

  static int getRotatedOrNot(String input1, int input2){
    List<String> list = Arrays.asList(input1.split(" "));
    String rotated = "";
    for(String element: list){
      rotated = element;
      for (int i = 0; i < input2; i++) {
        rotated = rotated.substring(rotated.length()-1) + rotated.substring(0, rotated.length()-1);
      }
      if(!rotated.equals(element)) return 0;
    }

    return 1;
  }

}
