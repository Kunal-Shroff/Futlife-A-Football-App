package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class athleticclubmain {

    private static final String url = "https://api.myjson.com/bins/9wda0/";


    public static athleticclubmain.Athleticclubfootball athleticclubfootball = null;
    public static athleticclubmain.Athleticclubfootball getathelticclubteam(){

        if (athleticclubfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            athleticclubfootball = retrofit.create(athleticclubmain.Athleticclubfootball.class);

        }

        return athleticclubfootball;
    }

    public interface Athleticclubfootball{


        @GET("https://api.myjson.com/bins/9wda0/")
        Call<List<athleticclubAPI>> getathleticclubplayers();
    }
}
