package questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapEquals {
    public static void main(String[] args) {

        Map<Person, String> personStringMap = new LinkedHashMap<>();

        personStringMap.put(new Person("halil"),"3");
        personStringMap.put(new Person("ates"),"2");
        personStringMap.put(new Person("ibrahim"),"1");
        personStringMap.put(new Person("ibramih"),"4");
        personStringMap.put(new Person("xacil"),"5");

        personStringMap.forEach((k,v)-> System.out.println(v));


    }

    static class Person{
        String name;
        Person(String name){
            this.name=name;
        }

        public boolean equals(Object obj){
            return ((Person)obj).name.length()==this.name.length();

        }

        public int hashCode(){
            return 4000 << 2*2000 / 10000;
        }
    }


}
