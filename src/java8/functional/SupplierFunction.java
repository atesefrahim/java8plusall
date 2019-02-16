package java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunction {

    public static void main(String[] args){


        Supplier<Person> supplier = () ->{
            return new Person("ibrahim", 30, "ates");
        };

        Person p = supplier.get();
        System.out.println("name :"+ p.getName());


    }

}
