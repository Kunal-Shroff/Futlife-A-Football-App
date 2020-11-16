package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class wolvesmain {

    private static final String url = "https://api.myjson.com/bins/1dg680/";


    public static wolvesmain.Wolvesfootball wolvesfootball = null;
    public static wolvesmain.Wolvesfootball getwolvesteam(){

        if (wolvesfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            wolvesfootball = retrofit.create(wolvesmain.Wolvesfootball.class);

        }

        return wolvesfootball;
    }

    public interface Wolvesfootball{


        @GET("https://api.myjson.com/bins/1dg680/")
        Call<List<wolvesAPI>> getwolvesplayers();
    }
}
