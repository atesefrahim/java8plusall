package java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerFunction {

    public static void main(String[] args){

        Consumer<Integer> consumer = i -> System.out.println("print :"+i);

        Consumer<Integer> consumerWithThen = consumer.andThen(i -> System.out.println("print :"+i));


        List<Integer> list = Arrays.asList(1,5,69);

        printList(list, consumer);

        consumer.accept(4);

        

    }

    private static void printList(List<Integer> list, Consumer<Integer> consumer) {

        for(Integer integer:list){
            consumer.accept(integer);
        }
    }
}
