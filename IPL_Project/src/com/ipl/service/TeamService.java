package com.ipl.service;

import com.ipl.dao.MobileDao;
import com.ipl.entity.Player;
import com.ipl.entity.Team;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamService {
    private MobileDao mobileDao;
    private static final String ANSI_BOLD = "\u001B[1m";
    private static final String ANSI_RESET = "\u001B[0m";

    public TeamService() {
        mobileDao = new MobileDao();
    }

    public Map<String, Team> getAllTeams() {
        Map<String, List<Player>> teamMap = mobileDao.getAllTeams();
        Map<String, Team> teams = new HashMap<>();

        for (Map.Entry<String, List<Player>> entry : teamMap.entrySet()) {
            List<Player> players = entry.getValue();
            // Set role for each player
            for (Player player : players) {
                player.setRole(determineRole(player.getRunsScored(), player.getWickets()));
            }
            teams.put(entry.getKey(), new Team(entry.getKey(), players));
        }

        return teams;
    }

    private String determineRole(int runs, int wickets) {
        if (runs >= 1000 && wickets >= 35) {
            return "All-Rounder";
        } else if (runs >= 1000) {
            return "Batsman";
        } else if (wickets >= 50) {
            return "Bowler";
        }
        return "Player";
    }

    public void displayTeamPlayers(Team team) {
        System.out.println( ANSI_BOLD + "\nPlayers in " + team.getTeamName() + ":" + ANSI_RESET );
        printTableHeader();
        for (Player player : team.getPlayers()) {
            player.displayPlayerDetails();
        }
    }

    public void displayBatsmen(Team team) {
        System.out.println( ANSI_BOLD + "\nBatsmen in " + team.getTeamName() + ":" + ANSI_RESET );
        printTableHeader();
        for (Player player : team.getPlayers()) {
            if ("Batsman".equals(player.getRole()) || "All-Rounder".equals(player.getRole())) {
                player.displayPlayerDetails();
            }
        }
    }

    public void displayBowlers(Team team) {
        System.out.println( ANSI_BOLD + "\nBowlers in " + team.getTeamName() + ":" + ANSI_RESET );
        printTableHeader();
        for (Player player : team.getPlayers()) {
            if ("Bowler".equals(player.getRole()) || "All-Rounder".equals(player.getRole())) {
                player.displayPlayerDetails();
            }
        }
    }

    public void displayAllRounders(Team team) {
        System.out.println( ANSI_BOLD + "\nAll-Rounders in " + team.getTeamName() + ":" + ANSI_RESET );
        printTableHeader();
        for (Player player : team.getPlayers()) {
            if ("All-Rounder".equals(player.getRole())) {
                player.displayPlayerDetails();
            }
        }
    }

    public void displayBatsmenMoreThan5000Runs(Team team) {
        System.out.println( ANSI_BOLD + "\nBatsmen with more than 5000 runs in " + team.getTeamName() + ":" + ANSI_RESET );
        printTableHeader();
        for (Player player : team.getPlayers()) {
            if (player.getRunsScored() > 5000) {
                player.displayPlayerDetails();
            }
        }
    }

    public void displayBowlersMoreThan100Wickets(Team team) {
        System.out.println( ANSI_BOLD + "\nBowlers with more than 100 wickets in " + team.getTeamName() + ":" + ANSI_RESET );
        printTableHeader();
        for (Player player : team.getPlayers()) {
            if (player.getWickets() > 100) {
                player.displayPlayerDetails();
            }
        }
    }
    
    
    private void printTableHeader() {
        System.out.println("----------------------------------------------------------------------------------------------");

        System.out.printf("|"+ ANSI_BOLD + " %-20s | %-10s | %-15s | %-10s | %-12s | %-8s"+ ANSI_RESET + " |\n",
                "Name", "Jersey No", "Role", "Matches", "Runs Scored", "Wickets");
        
        System.out.println("----------------------------------------------------------------------------------------------");

        //System.out.println(ANSI_BOLD + "This is bold text" + ANSI_RESET);
        
        //System.out.println("|-----------------|------------|-----------------|------------|--------------|----------|");
    }
    
}
