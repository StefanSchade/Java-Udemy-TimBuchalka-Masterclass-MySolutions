package de.stefanschade.learning.tryout.generics;

import java.util.ArrayList;

public class Team<T extends Player> {

    public Team(String teamName) {
        this.teamName = teamName;
    }

    private String teamName;

    private ArrayList<T> teamMembers = new ArrayList<>();

    private int gamesWon = 0;
    private int gamesLost = 0;
    private int gamesTied = 0;
    private int gamesPlayed = 0;

    public String getTeamName() {
        return teamName;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }


    public void captureResults(Team awayTeam, int scoreHomeTeam, int scoreAwayTeam) {

        if (scoreHomeTeam < scoreAwayTeam) { // we lost
            this.gamesLost++;
        } else if (scoreHomeTeam > scoreAwayTeam) { // we won
            this.gamesWon++;
        } else { // we tied

        }

        if (awayTeam != null) {
            awayTeam.captureResults(null, scoreAwayTeam, scoreHomeTeam);
        }

    }

    public boolean addPlayer(T player) {
        if (teamMembers.contains(player)) {
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else {
            teamMembers.add(player);
            System.out.println(player.getName() + " joins " + this.teamName);
            return true;
        }
    }

    public int numPlayers() {
        return this.teamMembers.size();
    }



    public void setGamesTied(int gamesTied) {
        this.gamesTied = gamesTied;
    }

    public int rankink() {
        return gamesWon*2 + gamesTied;
    }

}
