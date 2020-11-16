package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class mallorcamain {

    private static final String url = "https://api.myjson.com/bins/19oiqg/";


    public static mallorcamain.Mallorcafootball mallorcafootball = null;
    public static mallorcamain.Mallorcafootball getMallorcafootballteam(){

        if (mallorcafootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            mallorcafootball = retrofit.create(mallorcamain.Mallorcafootball.class);

        }

        return mallorcafootball;
    }
    public interface Mallorcafootball{


        @GET("https://api.myjson.com/bins/19oiqg/")
        Call<List<mallorcaAPI>> getmallorcaplayers();
    }
}


