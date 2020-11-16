package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class watfordmain {

    private static final String url = "https://api.myjson.com/bins/bxv40/";


    public static watfordmain.Watfordfootball watfordfootball = null;
    public static watfordmain.Watfordfootball getwatfordteam(){

        if (watfordfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            watfordfootball = retrofit.create(watfordmain.Watfordfootball.class);

        }

        return watfordfootball;
    }

    public interface Watfordfootball{


        @GET("https://api.myjson.com/bins/bxv40/")
        Call<List<watfordAPI>> getwatfordplayers();
    }
}
