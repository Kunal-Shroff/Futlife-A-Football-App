package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class sampdoriamain {

    private static final String url = "https://api.myjson.com/bins/dln9s/";


    public static sampdoriamain.Lillefootball lillefootball = null;
    public static sampdoriamain.Lillefootball getsaintfootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(sampdoriamain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/dln9s/")
        Call<List<sampdoriaAPI>> getsaintplayers();
    }
}
