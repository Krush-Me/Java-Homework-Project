package com.ipl.dao;

import com.ipl.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileDao {
    
    public Map<String, List<Player>> getAllTeams() {
        Map<String, List<Player>> teams = new HashMap<>();

        // Sample Data for CSK
        List<Player> cskPlayers = new ArrayList<>();
        cskPlayers.add(new Player(7, "MS Dhoni", 264, 5243, 0));
        cskPlayers.add(new Player(31, "Ruturaj Gaikwad", 66, 2380, 0));
        cskPlayers.add(new Player(90, "Deepak Chahar", 81, 80, 77));
        cskPlayers.add(new Player(8, "Ravindra Jadeja", 240, 2959, 160));
        cskPlayers.add(new Player(18, "Moeen Ali", 67, 1162, 35));
        teams.put("CSK", cskPlayers);

        // Sample Data for MI
        List<Player> miPlayers = new ArrayList<>();
        miPlayers.add(new Player(45, "Rohit Sharma", 257, 6628, 15));
        miPlayers.add(new Player(93, "Jasprit Bumrah", 133, 70, 165));
        miPlayers.add(new Player(33, "Hardik Pandya", 137, 2525, 64));
        miPlayers.add(new Player(63, "Suryakumar Yadav", 150, 3594, 0));
        teams.put("MI", miPlayers);

        // Sample Data for RCB
        List<Player> rcbPlayers = new ArrayList<>();
        rcbPlayers.add(new Player(18, "Virat Kohli", 252, 8004, 4));
        rcbPlayers.add(new Player(32, "Glenn Maxwell", 134, 2771, 37));
        rcbPlayers.add(new Player(73, "Mohmmad Siraj", 93, 109, 93));
        rcbPlayers.add(new Player(13, "Faf Du Plessis", 145, 4571, 4));
        teams.put("RCB", rcbPlayers);

        return teams;
    }
}
