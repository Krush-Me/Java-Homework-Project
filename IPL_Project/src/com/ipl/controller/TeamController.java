package com.ipl.controller;

import com.ipl.entity.Team;
import com.ipl.service.TeamService;

import java.util.Map;

public class TeamController {
    private TeamService teamService;

    public TeamController() {
        teamService = new TeamService();
    }

    public Map<String, Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    public void displayTeamPlayers(Team team) {
        teamService.displayTeamPlayers(team);
    }

    public void displayBatsmen(Team team) {
        teamService.displayBatsmen(team);
    }

    public void displayBowlers(Team team) {
        teamService.displayBowlers(team);
    }

    public void displayAllRounders(Team team) {
        teamService.displayAllRounders(team);
    }

    public void displayBatsmenMoreThan5000Runs(Team team) {
        teamService.displayBatsmenMoreThan5000Runs(team);
    }

    public void displayBowlersMoreThan100Wickets(Team team) {
        teamService.displayBowlersMoreThan100Wickets(team);
    }
}
