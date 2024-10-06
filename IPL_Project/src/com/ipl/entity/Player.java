package com.ipl.entity;

public class Player {
    private int jerseyNo;
    private String name;
    private String role;
    private int matches;
    private int runsScored;
    private int wickets;

    public Player(int jerseyNo, String name, int matches, int runsScored, int wickets) {
        this.jerseyNo = jerseyNo;
        this.name = name;
        this.matches = matches;
        this.runsScored = runsScored;
        this.wickets = wickets;
    }
    
 
    public int getJerseyNo() {
        return jerseyNo;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

	public int getMatches() {
        return matches;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public int getWickets() {
        return wickets;
    }
    
    
//    public void displayPlayerDetails() {
//        System.out.println("\nName: " + name);
//        System.out.println("Jersey No: " + jerseyNo);
//        System.out.println("Role: " + role);
//        System.out.println("Matches: " + matches);
//        System.out.println("Runs Scored: " + runsScored);
//        System.out.println("Wickets: " + wickets);
//    }
    
    
    public void displayPlayerDetails() {
        System.out.printf("| %-20s | %-10d | %-15s | %-10d | %-12d | %-8d |\n",
                name, jerseyNo, role, matches, runsScored, wickets);
        System.out.println("----------------------------------------------------------------------------------------------");


    }
    
}
