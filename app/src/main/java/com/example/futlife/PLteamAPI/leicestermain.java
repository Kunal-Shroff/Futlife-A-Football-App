package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class leicestermain {

    private static final String url = "https://api.myjson.com/bins/8u71s/";


    public static leicestermain.Leicesterfootball leicesterfootball = null;
    public static leicestermain.Leicesterfootball getLeicesterteam(){

        if (leicesterfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            leicesterfootball = retrofit.create(leicestermain.Leicesterfootball.class);

        }

        return leicesterfootball;
    }

    public interface Leicesterfootball{


        @GET("https://api.myjson.com/bins/8u71s/")
        Call<List<leicesterAPI>> getleicesterplayers();
    }
}
