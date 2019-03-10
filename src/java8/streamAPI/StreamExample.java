package java8.streamAPI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamExample {

    public static void main(String[] args) {



        List<Person> personList = new ArrayList<>();
        personList.add(new Person("ibrahim", 30, "Istanbul"));
        personList.add(new Person("ates", 25, "Constantin"));

        printPersons(personList,25);

    }

    // using lambda
    public static void printPersons(List<Person> roster, int age) {

        roster
                .stream()
                .filter( p -> p.getAge() >= age)
                .sequential()
                .map(p -> p.getName())
                .forEach(namex -> System.out.println(namex));

        roster
                .stream()
                .filter( p -> p.getAge() >= age)
                .parallel()
                .map(p -> p.getAddress())
                .forEach(namex -> System.out.println(namex));


        Stream<Person> persons = roster.stream();

        List<Integer> listInt = persons.
                filter(x->x.getAge()>24)
                .map(getage->getage.getAge())
                .collect(Collectors.toList());

        listInt.forEach(t-> System.out.println(t));


    }
}
