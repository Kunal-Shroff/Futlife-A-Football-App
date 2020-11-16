package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class deportomain {

    private static final String url = "https://api.myjson.com/bins/boo3c/";


    public static deportomain.Deportofootball deportofootball = null;
    public static deportomain.Deportofootball getdeportoteam(){

        if (deportofootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            deportofootball = retrofit.create(deportomain.Deportofootball.class);

        }

        return deportofootball;
    }
    public interface Deportofootball{


        @GET("https://api.myjson.com/bins/boo3c/")
        Call<List<deportoAPI>> getdeportoplayers();
    }
}
