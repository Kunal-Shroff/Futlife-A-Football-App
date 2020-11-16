package com.example.futlife.BundesligaSubModule;

import com.example.futlife.CommonFiles.standingsConstructor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Bundint {

    @GET("?action=get_standings&league_id=195&APIkey=4a88ce84c7dda72777d68525fabf0658a0dbaeb89bebe9fbc66b701b2e5b1ee1")
    Call<List<standingsConstructor>> getDataSet();
}
