package com.example.futlife.BundesligaSubModule;

import com.example.futlife.CommonFiles.PLfixtureResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BundfixtureInterface {

    @GET("?met=Fixtures&leagueId=195&&timezone=Asia/Kolkata&APIkey=4a88ce84c7dda72777d68525fabf0658a0dbaeb89bebe9fbc66b701b2e5b1ee1&from=2020-09-19&to=2021-05-22")
    Call<PLfixtureResponse> getJSON();
}
