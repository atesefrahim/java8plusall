package java8.collectionAPI;

import java.util.Arrays;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        List<String> collList = Arrays.asList("ibrahim", "ates");

        collList.forEach(pr -> System.out.println(collList));

        List<CollectionObject> collectionObjects = Arrays.asList(new CollectionObject("ibrahim", 28, ""), new CollectionObject("ates", 29, ""), new CollectionObject("asd", 30, ""));
        collectionObjects.forEach(pr->pr.setAddress("Cizre"));

        collectionObjects.forEach(sr -> System.out.println(sr));

    }
}
