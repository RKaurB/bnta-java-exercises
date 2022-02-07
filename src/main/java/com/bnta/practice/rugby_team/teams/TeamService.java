package com.bnta.practice.rugby_team.teams;

import com.bnta.practice.rugby_team.players.Player;

public class TeamService {

    // Default constructor
    public TeamService() {

    }

    // Count empty spaces on team
    // Return int
    // Parameters needed:  Team

    public int countEmptySpacesOnTeam(Team team) {
        // Temporary variable to store count
        int count = 0;
        // Loop through players array and count nulls
        // (For each loop)
        for (Player player : team.getPlayers()) {
            // if statement
            // if player is null, add one to the count
            if (player == null) {
                count++;
                // Don't put a break here
            }

//        // (Fori loop, iteration)
//        Player[] players = team.getPlayers();
//        for (int i = 0; i < players.length ; i++) {
//            if (players[i] == null) {
//                count++;
//        }

        }
        // Return count
        return count;
    }

//    public void addPlayerToTeam(Team team, Player player) {
//        // Check if there's space on the team (an empty space)
//        int spaces = countEmptySpacesOnTeam(team);
//        // If there is, add the player
//        if (spaces > 0) {
//            // Get players array from the team
//            Player[] players = team.getPlayers();
//            // Add player to first available empty space
//            // Loop through players array
//            for (int i = 0; i < players.length; i++) {
//                // If we find an empty space, add the player to it, then break
//                if (players[i] == null) {
//                    players[i] = player;
//                    break;
//            }
//
//            }
//
//        }
//
//    }

    public void addPlayerToTeam(Team team, Player player) throws Exception{
        // Check if there's space on the team (an empty space)
        int spaces = countEmptySpacesOnTeam(team);
        // If there is, add the player
        if (spaces > 0) {
            // Get players array from the team
            Player[] players = team.getPlayers();
            // Add player to first available empty space
            // Loop through players array
            for (int i = 0; i < players.length; i++) {
                // If we find an empty space, add the player to it, then break
                if (players[i] == null) {
                    players[i] = player;
                    break;
                }

            }

        }
        else {
            throw new Exception();
            // throw new Exception("Team is full!")
            // throw new IllegalStateException("Team is full!")
        }
    }


}
