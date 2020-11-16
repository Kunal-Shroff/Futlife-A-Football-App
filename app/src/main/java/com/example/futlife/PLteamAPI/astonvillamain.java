package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class astonvillamain {

    private static final String url = "https://api.myjson.com/bins/1cly9c/";


    public static astonvillamain.Astonvillafootball astonvillafootball = null;
    public static astonvillamain.Astonvillafootball getastonvillateam(){

        if (astonvillafootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            astonvillafootball = retrofit.create(astonvillamain.Astonvillafootball.class);

        }

        return astonvillafootball;
    }

    public interface Astonvillafootball{


        @GET("https://api.myjson.com/bins/1cly9c/")
        Call<List<astonvillaAPI>> getastonvillaplayers();
    }
}
