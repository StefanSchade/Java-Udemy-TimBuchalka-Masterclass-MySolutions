package de.stefanschade.learning.tryout.generics;

public class Main {

    public static void main(String[] args) {

        GenericContainer<String> myStringContainer = new GenericContainer<>("test");
        GenericContainer<Integer> myIntegerContainer = new GenericContainer<>(1);

        String myString = myStringContainer.getData();
        int myInteger = myIntegerContainer.getData();

        System.out.println(myString);
        System.out.println(myInteger);


        Team<SoccerPlayer> fcbayern = new Team<>("FC Bayern");
        Team<SoccerPlayer> eintrachtffm = new Team<>("Eintracht Frankfurt");


        SoccerPlayer tim = new SoccerPlayer("Tim");
        SoccerPlayer joe = new SoccerPlayer("Joe");

        HockeyPlayer andrea = new HockeyPlayer("Andrea");
        HockeyPlayer frank = new HockeyPlayer("Frank");

        BaseballPlayer donald = new BaseballPlayer("Donald");
        BaseballPlayer mark = new BaseballPlayer("Mark");

        fcbayern.addPlayer(tim);
        fcbayern.addPlayer(tim);
        fcbayern.addPlayer(joe);
        //       fcbayern.addPlayer(andrea); this is an exception
        System.out.println("Team " + fcbayern.getTeamName() + " has " + fcbayern.numPlayers() + " plazers");


        eintrachtffm.addPlayer(tim);
        eintrachtffm.addPlayer(tim);
        eintrachtffm.addPlayer(joe);
        System.out.println("Team " + eintrachtffm.getTeamName() + " has " + eintrachtffm.numPlayers() + " plazers");


        fcbayern.captureResults(eintrachtffm,1,0);
        fcbayern.captureResults(eintrachtffm,1,2);
        fcbayern.captureResults(eintrachtffm,1,0);
        fcbayern.captureResults(eintrachtffm,1,2);
        fcbayern.captureResults(eintrachtffm,2,2);

        System.out.println(eintrachtffm.rankink());
        System.out.println(fcbayern.rankink());

    }

}
