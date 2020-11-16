package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class getafemain {

    private static final String url = "https://api.myjson.com/bins/os7eg/";


    public static getafemain.Getafefootball getafefootball = null;
    public static getafemain.Getafefootball getgetafeteam(){

        if (getafefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            getafefootball = retrofit.create(getafemain.Getafefootball.class);

        }

        return getafefootball;
    }
    public interface Getafefootball{


        @GET("https://api.myjson.com/bins/os7eg/")
        Call<List<getafeAPI>> getgetafeplayers();
    }
}
