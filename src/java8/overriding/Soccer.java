package java8.overriding;

public class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers() {
        System.out.println( "Each team has n players in " + getName() );
    }
}