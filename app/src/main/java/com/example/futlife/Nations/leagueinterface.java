package com.example.futlife.Nations;

import retrofit2.Call;
import retrofit2.http.GET;

public interface leagueinterface {

    @GET("?met=Leagues&APIkey=4a88ce84c7dda72777d68525fabf0658a0dbaeb89bebe9fbc66b701b2e5b1ee1")
    Call<leagueResponse> getDataSet();
}
