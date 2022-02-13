package com.bnta.practice.rugby_team.teams;

import com.bnta.s10_intro_to_classes.rugby_team_practice.managers.Manager;
import com.bnta.s10_intro_to_classes.rugby_team_practice.players.Player;
import com.bnta.s10_intro_to_classes.rugby_team_practice.teams.Team;
import com.bnta.s10_intro_to_classes.rugby_team_practice.teams.TeamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamServiceTest {

    @BeforeEach
    public void setup() {
        TeamService underTest = new TeamService();
    }

    // Checks that it gives us 15 when it's empty...
    @Test       // This is what allows us to run the test!
    public void canCountEmptySpacesOnTeamWhenEmpty() {
        // Given
        Manager manager = new Manager("test manager");
        Team team = new Team("team1", manager);
        TeamService underTest = new TeamService();
        // When
        int actual = underTest.countEmptySpacesOnTeam(team);
        // Then
        // assertThat(actual).isEqualTo(15);
        int expected = 15;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canCountEmptySpacesOnTeamWithOnePlayer() {
        // Given
        Manager manager = new Manager("test manager");
        Team team = new Team("Test RFC", manager);
        Player player = new Player("test player", "winger", 11, 2);
        TeamService underTest = new TeamService();
        try {
            underTest.addPlayerToTeam(team, player);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // When
        int actual = underTest.countEmptySpacesOnTeam(team);
        // Then
        int expected = 14;
        assertThat(actual).isEqualTo(expected);
    }

}