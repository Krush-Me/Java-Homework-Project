package com.tka.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tka.entity.Player;

public class IPLDao {

	public Map<String, List<Player>> getAllTeams() {

		Map<String, List<Player>> teams = new HashMap<>();

		List<Player> cskPlayers = new ArrayList<>();
		cskPlayers.add(new Player(7, "MS Dhoni", 264, 5243, 0, "CSK"));
		cskPlayers.add(new Player(31, "Ruturaj Gaikwad", 66, 2380, 0, "CSK"));
		cskPlayers.add(new Player(90, "Deepak Chahar", 81, 80, 77, "CSK"));
		cskPlayers.add(new Player(8, "Ravindra Jadeja", 240, 2959, 160, "CSK"));
		cskPlayers.add(new Player(18, "Moeen Ali", 67, 1162, 35, "CSK"));
		cskPlayers.add(new Player(10, "Ambati Rayudu", 200, 4098, 100, "CSK"));
		cskPlayers.add(new Player(23, "N Jagadeesan", 44, 883, 0, "CSK"));
		cskPlayers.add(new Player(37, "Kedar Jadhav", 93, 2074, 60, "CSK"));
		cskPlayers.add(new Player(19, "Shivam Dube", 55, 1200, 20, "CSK"));
		teams.put("CSK", cskPlayers);

		List<Player> miPlayers = new ArrayList<>();
		miPlayers.add(new Player(45, "Rohit Sharma", 257, 6628, 15, "MI"));
		miPlayers.add(new Player(93, "Jasprit Bumrah", 133, 70, 165, "MI"));
		miPlayers.add(new Player(33, "Hardik Pandya", 137, 2525, 64, "MI"));
		miPlayers.add(new Player(63, "Suryakumar Yadav", 150, 3594, 0, "MI"));
		miPlayers.add(new Player(55, "Ishan Kishan", 94, 2398, 0, "MI"));
		miPlayers.add(new Player(30, "Rahul Chahar", 45, 22, 45, "MI"));
		miPlayers.add(new Player(4, "Akash Madhwal", 12, 2, 11, "MI"));
		teams.put("MI", miPlayers);

		List<Player> rcbPlayers = new ArrayList<>();
		rcbPlayers.add(new Player(18, "Virat Kohli", 252, 8004, 4, "RCB"));
		rcbPlayers.add(new Player(32, "Glenn Maxwell", 134, 2771, 37, "RCB"));
		rcbPlayers.add(new Player(73, "Mohmmad Siraj", 93, 109, 93, "RCB"));
		rcbPlayers.add(new Player(13, "Faf Du Plessis", 145, 4571, 4, "RCB"));
		rcbPlayers.add(new Player(29, "Dinesh Karthik", 204, 4000, 0, "RCB"));
		rcbPlayers.add(new Player(8, "Wanindu Hasaranga", 53, 1250, 100, "RCB"));
		rcbPlayers.add(new Player(19, "Shahbaz Ahmed", 49, 975, 0, "RCB"));
		rcbPlayers.add(new Player(33, "Rajat Patidar", 33, 875, 0, "RCB"));
		rcbPlayers.add(new Player(44, "Harshal Patel", 53, 141, 98, "RCB"));
		teams.put("RCB", rcbPlayers);

		return teams;
	}

}
