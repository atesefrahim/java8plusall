package java8.collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class ListExample {

    static int min = 0;
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> listSub = new ArrayList<>();
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);

        list.add(listSub);

        listSub = new ArrayList<>();
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);
        listSub.add(0);
        listSub.add(0);

        list.add(listSub);

        listSub = new ArrayList<>();
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);
        listSub.add(0);
        listSub.add(0);

        list.add(listSub);

        listSub = new ArrayList<>();
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);
        listSub.add(0);
        listSub.add(0);

        list.add(listSub);

        listSub = new ArrayList<>();
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);
        listSub.add(1);

        list.add(listSub);

        System.out.println(list);

        for(List<Integer> element: list){
            int max = findMinRepeat(element);
        }

    }

    public static int findMinRepeat(List<Integer> list){

        return 0;
    }
}
