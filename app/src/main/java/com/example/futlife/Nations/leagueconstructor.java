package com.example.futlife.Nations;

public class leagueconstructor {

    public String league_key;
    public String league_name;
    public String country_key;
    public String country_name;
    public String league_logo;
    public String country_logo;

    public leagueconstructor(String league_key, String league_name, String country_key, String country_name, String league_logo, String country_logo) {
        this.league_key = league_key;
        this.league_name = league_name;
        this.country_key = country_key;
        this.country_name = country_name;
        this.league_logo = league_logo;
        this.country_logo = country_logo;



    }

    public String getLeague_key() {
        return league_key;
    }

    public String getLeague_name() {
        return league_name;
    }

    public String getCountry_key() {
        return country_key;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getLeague_logo() {
        return league_logo;
    }

    public String getCountry_logo() {
        return country_logo;
    }
}
