package java8.functional;

@FunctionalInterface
public interface InterfaceExample {

    void method1(Integer s);

    default void trace(String s){
        System.out.println("tracing :"+s);
    }

    static void print(String s){
        System.out.println("print :"+s);
    }


}
