package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


public class Arsenalmain {

    private static final String url = "https://api.myjson.com/bins/14hcb4/";


    public static Arsenalmain.Arsenalfootball arsenalfootball = null;
    public static Arsenalmain.Arsenalfootball getarsenalteam(){

        if (arsenalfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            arsenalfootball = retrofit.create(Arsenalmain.Arsenalfootball.class);

        }

        return arsenalfootball;
    }

    public interface Arsenalfootball{

        @GET("https://api.myjson.com/bins/14hcb4/")
        Call<List<ArsenalAPI>> getarsenalplayers();
    }
}
