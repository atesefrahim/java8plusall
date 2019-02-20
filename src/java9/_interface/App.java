package java9._interface;

public class App implements InterfaceExample, InterfaceExample2 {

    static InterfaceExample interfaceExample;

    public static void main(String[] args) {
        App cls = new App();

        String myCo = "Gt";

        cls.print(myCo);



    }

    @Override
    public void print(String s) {

        InterfaceExample.super.print(s);
        InterfaceExample2.super.print(s);

    }
}
