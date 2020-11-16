package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class southamptonmain {

    private static final String url = "https://api.myjson.com/bins/pkh5c/";


    public static southamptonmain.Southamptonfootball southamptonfootball = null;
    public static southamptonmain.Southamptonfootball getSouthamptonteam(){

        if (southamptonfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            southamptonfootball = retrofit.create(southamptonmain.Southamptonfootball.class);

        }

        return southamptonfootball;
    }

    public interface Southamptonfootball{


        @GET("https://api.myjson.com/bins/pkh5c/")
        Call<List<southamptonAPI>> getsouthamptonplayers();
    }
}
