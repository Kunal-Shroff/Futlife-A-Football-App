package com.example.futlife.CommonFiles;

public class TopConstruct {

    private String player_place;
    private String player_name;
    private String player_key;
    private String team_name;
    private String team_key;
    private String goals;

    public TopConstruct(String player_place, String player_name, String player_key, String team_name, String team_key, String goals) {
        this.player_place = player_place;
        this.player_name = player_name;
        this.player_key = player_key;
        this.team_name = team_name;
        this.team_key = team_key;
        this.goals = goals;
    }

    public String getPlayer_place() {
        return player_place;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public String getPlayer_key() {
        return player_key;
    }

    public String getTeam_name() {
        return team_name;
    }

    public String getTeam_key() {
        return team_key;
    }

    public String getGoals() {
        return goals;
    }
}
