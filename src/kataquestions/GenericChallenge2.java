package kataquestions;

//Following quiz is given by Oracle
public class GenericChallenge2 {

    public static void main(String... doYourBest) {
        Archer archer = new Archer();

        archer.attack("->");
        archer.attack(Double.valueOf(1.0));
        archer.attack(Float.valueOf(1));
    }

    /*
    The Archer class is receiving a generic type T in a class level. When we invoke the method attack passing a parameter of any type
    it works fine. However, note that the parameter is being passed to the local variable
    from the method and actually the instance variable from the class is being printed.
     */
    static class Archer<T> {
        T t;

        void attack(T t) {
            System.out.println(t);
        }
    }
}
