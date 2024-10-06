package com.ipl.client;

import com.ipl.controller.TeamController;
import com.ipl.entity.Team;

import java.util.Map;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        TeamController teamController = new TeamController();
        Map<String, Team> teams = teamController.getAllTeams();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nTeams: ");
            System.out.println("1. CSK");
            System.out.println("2. MI");
            System.out.println("3. RCB");
            System.out.println("4. Exit");
            System.out.print("Enter team to view details: \n");

            int choiceTeam = sc.nextInt();
            String selectedTeamName;
            switch (choiceTeam) {
                case 1:
                    selectedTeamName = "CSK";
                    break;
                case 2:
                    selectedTeamName = "MI";
                    break;
                case 3:
                    selectedTeamName = "RCB";
                    break;
                case 4:
                    System.out.println("Thank you...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input");
                    continue;
            }

            // Get selected team
            Team selectedTeam = teams.get(selectedTeamName);

            // Display specific roles based on user input
            while (true) {
                System.out.println("\nOptions: ");
                System.out.println("1. Show All Players");
                System.out.println("2. Show Batsmen");
                System.out.println("3. Show Bowlers");
                System.out.println("4. Show All-Rounders");
                System.out.println("5. Show Batsmen with More Than 5000 Runs");
                System.out.println("6. Show Bowlers with More Than 100 Wickets");
                System.out.println("7. Go Back to Team Selection");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        teamController.displayTeamPlayers(selectedTeam);
                        break;
                    case 2:
                    	teamController.displayBatsmen(selectedTeam);
                        break;
                    case 3:
                        teamController.displayBowlers(selectedTeam);
                        break;
                    case 4:
                        teamController.displayAllRounders(selectedTeam);
                        break;
                    case 5:
                        teamController.displayBatsmenMoreThan5000Runs(selectedTeam);
                        break;
                    case 6:
                        teamController.displayBowlersMoreThan100Wickets(selectedTeam);
                        break;
                    case 7:
                        break; // Go back to team selection
                    default:
                        System.out.println("Invalid choice.");
                }

                // Check if the user wants to go back to team selection
                if (choice == 7) {
                    break;
                }
            }
        }
    }
}
