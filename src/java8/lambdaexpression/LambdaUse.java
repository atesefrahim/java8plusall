package java8.lambdaexpression;


import java8.functional.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class LambdaUse {

    public static void main(String[] args) {

        /*LambdaInterface isGreaterThan = (i)-> (i/10)>3;
        System.out.println(isGreaterThan.computeTest(45));*/


        LambdaInterface reverseStr = (str) -> {

            String result="";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;

        };

        System.out.println(reverseStr.myStringFunc("Ibrahim"));


        LambdaGenericInterface<String> count = (strn) -> {

            int cnt = 0;
            String cntStr;

            for(int x=0; x<=strn.length()-1; x++)
                cnt++;

            cntStr=String.valueOf(cnt);

            return cntStr;
        };

        System.out.println("count of given string :"+count.compute("ates"));


        Stream<LambdaPerson> persons = asList(new LambdaPerson("ibrahim", 30, ""), new LambdaPerson("ates", 29, "")).stream();

        Stream<LambdaPerson> personStream = persons
                .filter(p -> p.getAge() > 29);

        personStream.forEach(kr-> System.out.println(kr));


        List<LambdaPerson> lambdaPeople = new ArrayList<>();
        lambdaPeople.add(new LambdaPerson("ibrahim", 30, ""));
        lambdaPeople.add(new LambdaPerson("ates", 25, ""));


        printPersonsOlderThan(lambdaPeople, 26);
        printPersons(lambdaPeople, 30);


    }

    // without lambda
    public static void printPersonsOlderThan(List<LambdaPerson> roster, int age) {
        for (LambdaPerson p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    // using lambda
    public static void printPersons(List<LambdaPerson> roster, int age) {



        roster
                .stream()
                .filter( p -> p.getAge() >= age
                              && p.getAge() <= age)
                .map(p -> p.getName())
                .forEach(name -> System.out.println(name));
   }

}
