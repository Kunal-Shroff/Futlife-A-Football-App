package com.example.futlife.LaLigateamAPI;

public class mallorcaAPI {

    private String coach_name;
    private String coach_country;
    private String coach_age;
    private String player_key;
    private String player_name;
    private String player_number;
    private String player_country;
    private String player_type;
    private String player_age;
    private String player_match_played;
    private String player_goals;
    private String player_yellow_cards;
    private String player_red_cards;


    public mallorcaAPI(String coach_name, String coach_country, String coach_age, String player_key, String player_name, String player_number, String player_country, String player_type, String player_age, String player_match_played, String player_goals, String player_yellow_cards, String player_red_cards) {
        this.coach_name = coach_name;
        this.coach_country = coach_country;
        this.coach_age = coach_age;
        this.player_key = player_key;
        this.player_name = player_name;
        this.player_number = player_number;
        this.player_country = player_country;
        this.player_type = player_type;
        this.player_age = player_age;
        this.player_match_played = player_match_played;
        this.player_goals = player_goals;
        this.player_yellow_cards = player_yellow_cards;
        this.player_red_cards = player_red_cards;
    }

    public String getCoach_name() {
        return coach_name;
    }

    public String getCoach_country() {
        return coach_country;
    }

    public String getCoach_age() {
        return coach_age;
    }

    public String getPlayer_key() {
        return player_key;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public String getPlayer_number() {
        return player_number;
    }

    public String getPlayer_country() {
        return player_country;
    }

    public String getPlayer_type() {
        return player_type;
    }

    public String getPlayer_age() {
        return player_age;
    }

    public String getPlayer_match_played() {
        return player_match_played;
    }

    public String getPlayer_goals() {
        return player_goals;
    }

    public String getPlayer_yellow_cards() {
        return player_yellow_cards;
    }

    public String getPlayer_red_cards() {
        return player_red_cards;
    }
}
