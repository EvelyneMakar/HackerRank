public class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
    public void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }

}
