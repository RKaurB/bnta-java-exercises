package com.bnta.practice.rugby_team;

import com.bnta.practice.rugby_team.managers.Manager;
import com.bnta.practice.rugby_team.players.Player;
import com.bnta.practice.rugby_team.teams.Team;

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

        System.out.println(scotland.toString());
        System.out.println(england.toString());

    }

}
