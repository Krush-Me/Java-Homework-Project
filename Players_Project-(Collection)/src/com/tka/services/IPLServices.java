package com.tka.services;

import java.util.List;
import java.util.Map;
import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLServices {

	private IPLDao ipldao;
	private static final String ANSI_BOLD = "\u001B[1m";
	private static final String ANSI_RESET = "\u001B[0m";

	public IPLServices() {
		ipldao = new IPLDao();
	}

	public Map<String, List<Player>> getAllTeams() {
		return ipldao.getAllTeams();
	}

	private String determineRole(int runsScored, int wickets) {
		if (runsScored >= 1000 && wickets >= 35) {
			return "All-Rounder";
		} else if (runsScored >= 1000) {
			return "Batsmen";
		} else if (wickets >= 35) {
			return "Bowler";
		}
		return "Player";
	}

	public void displayTeamPlayers(String teamName) {
		System.out.println(ANSI_BOLD + "\nPlayers in the team:" + ANSI_RESET);
		printTableHeader();

		List<Player> players = ipldao.getAllTeams().get(teamName);
		for (Player player : players) {
			player.setRole(determineRole(player.getRunsScored(), player.getWickets()));
			player.displayPlayerDetails();
		}
	}

	public void displayBatsmen(String teamName) {
		System.out.println(ANSI_BOLD + "\nBatsmen in the team:" + ANSI_RESET);
		printTableHeader();

		List<Player> players = ipldao.getAllTeams().get(teamName);
		for (Player player : players) {
			player.setRole(determineRole(player.getRunsScored(), player.getWickets()));
			if ("Batsmen".equals(player.getRole()) || "All-Rounder".equals(player.getRole())) {
				player.displayPlayerDetails();
			}
		}
	}

	public void displayBowler(String teamName) {
		System.out.println(ANSI_BOLD + "\nBowlers in the team:" + ANSI_RESET);
		printTableHeader();

		List<Player> players = ipldao.getAllTeams().get(teamName);
		for (Player player : players) {
			player.setRole(determineRole(player.getRunsScored(), player.getWickets()));
			if ("Bowler".equals(player.getRole()) || "All-Rounder".equals(player.getRole())) {
				player.displayPlayerDetails();
			}
		}
	}

	public void displayAllRounder(String teamName) {
		System.out.println(ANSI_BOLD + "\nAll Rounders in the team:" + ANSI_RESET);
		printTableHeader();

		List<Player> players = ipldao.getAllTeams().get(teamName);
		for (Player player : players) {
			player.setRole(determineRole(player.getRunsScored(), player.getWickets()));
			if ("All-Rounder".equals(player.getRole())) {
				player.displayPlayerDetails();
			}
		}
	}

	public void displayBatsmenMoreThan5000Runs(String teamName) {
		System.out.println(ANSI_BOLD + "\nBatsmen with more than 5000 runs in the team:" + ANSI_RESET);
		System.out.println("------------------------------------------------------------------");
		System.out.printf("|" + ANSI_BOLD + " %-20s | %-10s | %-10s | %-12s " + ANSI_RESET + " |\n", "Name",
				"Jersey No", "Matches", "Runs Scored");
		System.out.println("------------------------------------------------------------------");

		List<Player> players = ipldao.getAllTeams().get(teamName);
		for (Player player : players) {
			if (player.getRunsScored() >= 5000) {
				System.out.printf("| %-20s | %-10s | %-10s | %-12s  |", player.getName(), player.getJerseyNo(),
						player.getMatches(), player.getRunsScored());
				System.out.println("\n------------------------------------------------------------------");
			}
		}
	}

	public void displayBowlersMoreThan100Wickets(String teamName) {
		System.out.println(ANSI_BOLD + "\nBowlers with more than 100 wickets in the team:" + ANSI_RESET);
		System.out.println("------------------------------------------------------------------");
		System.out.printf("|" + ANSI_BOLD + " %-20s | %-10s | %-10s | %-12s " + ANSI_RESET + " |\n", "Name",
				"Jersey No", "Matches", "Runs Scored");
		System.out.println("------------------------------------------------------------------");

		List<Player> players = ipldao.getAllTeams().get(teamName);
		for (Player player : players) {
			if (player.getWickets() >= 100) {
				System.out.printf("| %-20s | %-10s | %-10s | %-12s  |", player.getName(), player.getJerseyNo(),
						player.getMatches(), player.getWickets());
				System.out.println("\n------------------------------------------------------------------");
			}
		}
	}

	private void printTableHeader() {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.printf("|" + ANSI_BOLD + " %-20s | %-10s | %-15s | %-10s | %-12s | %-8s" + ANSI_RESET + " |\n",
				"Name", "Jersey No", "Role", "Matches", "Runs Scored", "Wickets");
		System.out.println(
				"----------------------------------------------------------------------------------------------");
	}
}
