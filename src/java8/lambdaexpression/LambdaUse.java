package java8.lambdaexpression;

import java8.functional.InterfaceExample;

public class LambdaUse {

    public static void main(String[] args) {
        InterfaceExample interfaceExample =(i)-> System.out.println(i);
        interfaceExample.trace("him");
    }
}
