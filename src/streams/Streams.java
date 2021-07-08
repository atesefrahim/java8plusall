package com.ates.training.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

  public static void main(String[] args) {
    List<String> myList = new ArrayList<>();
    myList.add("ibrahim");
    myList.add("ates");
    myList.add("Ranya");

    System.out.println(myList.toString());

    List<String> newList = myList.stream()
        .filter(e -> e.equalsIgnoreCase("ates"))
        .map(e -> e.toUpperCase())
        .collect(Collectors.toList());

    System.out.println(newList.toString());

    List<Integer> secondList = new ArrayList<>();
    secondList.add(1);
    secondList.add(5);

    System.out.println(
        secondList.stream().filter(e -> e.compareTo(3) > 0).collect(Collectors.toList())
            .toString());

    System.out.println(
        secondList.stream().filter(e -> e.compareTo(3) < 0).findAny().equals(1));
  }

}
