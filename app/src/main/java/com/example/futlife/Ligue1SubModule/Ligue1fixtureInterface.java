package com.example.futlife.Ligue1SubModule;

import com.example.futlife.CommonFiles.PLfixtureResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Ligue1fixtureInterface {

    @GET("?met=Fixtures&leagueId=176&&timezone=Asia/Kolkata&APIkey=4a88ce84c7dda72777d68525fabf0658a0dbaeb89bebe9fbc66b701b2e5b1ee1&from=2020-08-21&to=2021-05-23")
    Call<PLfixtureResponse> getJSON();
}
