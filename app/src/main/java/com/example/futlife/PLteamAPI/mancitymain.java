package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class mancitymain {

    private static final String url = "https://api.myjson.com/bins/1bjddc/";


    public static mancitymain.Mancityfootball mancityfootball = null;
    public static mancitymain.Mancityfootball getmancityteam(){

        if (mancityfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            mancityfootball = retrofit.create(mancitymain.Mancityfootball.class);

        }

        return mancityfootball;
    }

    public interface Mancityfootball{


        @GET("https://api.myjson.com/bins/1bjddc/")
        Call<List<mancityAPI>> getmancityplayers();
    }

}
