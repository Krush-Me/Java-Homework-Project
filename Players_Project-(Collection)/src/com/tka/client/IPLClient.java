package com.tka.client;

import java.util.Scanner;

import com.tka.controller.IPLController;

public class IPLClient {

	public static void main(String[] args) {

		IPLController iplcontroller = new IPLController();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nTeams: ");
			System.out.println("1. CSK");
			System.out.println("2. MI");
			System.out.println("3. RCB");
			System.out.println("4. Exit");
			System.out.print("Enter team to view details: \n");

			int choiceTeam = sc.nextInt();
			String selectedTeamName = null;

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
				System.out.println("Invalid input...");
				continue;
			}

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
					iplcontroller.displayTeamPlayers(selectedTeamName);
					break;
				case 2:
					iplcontroller.displayBatsmen(selectedTeamName);
					break;
				case 3:
					iplcontroller.displayBowler(selectedTeamName);
					break;
				case 4:
					iplcontroller.displayAllRounder(selectedTeamName);
					break;
				case 5:
					iplcontroller.displayBatsmenMoreThan5000Runs(selectedTeamName);
					break;
				case 6:
					iplcontroller.displayBowlersMoreThan100Wickets(selectedTeamName);
					break;
				case 7:
					break;
				default:
					System.out.println("Invalid Choice...");
				}

				if (choice == 7) {
					break;
				}

			}
		}

	}

}
