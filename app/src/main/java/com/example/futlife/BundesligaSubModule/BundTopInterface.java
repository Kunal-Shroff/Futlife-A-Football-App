package com.example.futlife.BundesligaSubModule;

import com.example.futlife.CommonFiles.PLtopResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BundTopInterface {

    @GET("?&met=Topscorers&leagueId=195&APIkey=4a88ce84c7dda72777d68525fabf0658a0dbaeb89bebe9fbc66b701b2e5b1ee1")
    Call<PLtopResponse> getJSON();
}
