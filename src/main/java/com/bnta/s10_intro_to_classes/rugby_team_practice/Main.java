package com.bnta.s10_intro_to_classes.rugby_team_practice;

import com.bnta.s10_intro_to_classes.rugby_team_practice.managers.Manager;
import com.bnta.s10_intro_to_classes.rugby_team_practice.players.Player;
import com.bnta.s10_intro_to_classes.rugby_team_practice.teams.Team;
import com.bnta.s10_intro_to_classes.rugby_team_practice.teams.TeamService;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Finn Russell", "Fly Half", 10, 10);
        // Player player2 = new Player("Stuart Hogg", "Full Back", 15, 5)

        // System.out.println(player1);
        // System.out.println(player1.toString());

        Manager manager1 = new Manager("Gregor Towsend");
        Team scotland = new Team("Scotland", manager1);

        Manager manager2 = new Manager("Eddie Jones");
        Team england = new Team("England", manager2);

//        System.out.println(scotland.toString());
//        System.out.println(england.toString());

        // Create an instance
        // (We can then test this!)
//        TeamService teamService = new TeamService();
//        int spaces = teamService.countEmptySpacesOnTeam(scotland);
//        System.out.println(spaces);

        TeamService teamService = new TeamService();

        int spacesBefore = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spacesBefore);

//        // Add player to team
//        teamService.addPlayerToTeam(scotland, player1);
        try {
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);
            teamService.addPlayerToTeam(scotland, player1);   // Trying to add a 16th player
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Team is full!");
            // System.out.println(e.getMessage());
        }

        int spacesAfter = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spacesAfter);

    }

}
