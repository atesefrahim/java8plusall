package java8.interfacepackage;

public class Account implements OnlineAccount, Comparable<Account> {



    public Account() {

    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }


}
