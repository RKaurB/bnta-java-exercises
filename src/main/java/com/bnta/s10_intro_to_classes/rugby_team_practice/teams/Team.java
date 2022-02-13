package com.bnta.s10_intro_to_classes.rugby_team_practice.teams;

import com.bnta.s10_intro_to_classes.rugby_team_practice.managers.Manager;
import com.bnta.s10_intro_to_classes.rugby_team_practice.players.Player;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    // PROPERTIES

    // At the moment we don't know anything about the size of the array (later in the Constructor...)
    private Player[] players;
    private String name;
    private Manager manager;

    public Team() {

    }

    public Team(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
        this.players = new Player[15];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Arrays.equals(players, team.players) && Objects.equals(name, team.name) && Objects.equals(manager, team.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, manager);
        result = 31 * result + Arrays.hashCode(players);
        return result;
    }
}
