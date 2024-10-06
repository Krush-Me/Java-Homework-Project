package com.tka.controller;

import java.util.List;
import java.util.Map;

import com.tka.entity.Player;
import com.tka.services.IPLServices;

public class IPLController {

	private IPLServices iplservice;

	public IPLController() {
		iplservice = new IPLServices();
	}

	public Map<String, List<Player>> getAllTeams() {
		return iplservice.getAllTeams();
	}

	public void displayTeamPlayers(String teamName) {
		iplservice.displayTeamPlayers(teamName);
	}

	public void displayBatsmen(String teamName) {
		iplservice.displayBatsmen(teamName);
	}

	public void displayBowler(String teamName) {
		iplservice.displayBowler(teamName);
	}

	public void displayAllRounder(String teamName) {
		iplservice.displayAllRounder(teamName);
	}

	public void displayBatsmenMoreThan5000Runs(String teamName) {
		iplservice.displayBatsmenMoreThan5000Runs(teamName);
	}

	public void displayBowlersMoreThan100Wickets(String teamName) {
		iplservice.displayBowlersMoreThan100Wickets(teamName);
	}

}
