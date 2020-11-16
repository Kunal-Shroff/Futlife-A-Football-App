package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class spursmain {

    private static final String url = "https://api.myjson.com/bins/1frjrk/";


    public static spursmain.Spursfootball spursfootball = null;
    public static spursmain.Spursfootball getspursteam(){

        if (spursfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            spursfootball = retrofit.create(spursmain.Spursfootball.class);

        }

        return spursfootball;
    }

    public interface Spursfootball{


        @GET("https://api.myjson.com/bins/1frjrk/")
        Call<List<spursAPI>> getspursplayers();
    }
}
