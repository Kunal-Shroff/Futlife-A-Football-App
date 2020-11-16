package com.example.futlife.EuropaLeague;

import com.example.futlife.CommonFiles.PLfixtureResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ELScheduleInterface {

    @GET("?met=Fixtures&leagueId=590&timezone=Asia/Kolkata&APIkey=4a88ce84c7dda72777d68525fabf0658a0dbaeb89bebe9fbc66b701b2e5b1ee1&from=2019-08-10&to=2020-05-23")
    Call<PLfixtureResponse> getJSON();
}
