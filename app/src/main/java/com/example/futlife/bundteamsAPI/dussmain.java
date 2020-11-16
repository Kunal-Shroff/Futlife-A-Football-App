package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class dussmain {

    private static final String url = "https://api.myjson.com/bins/ggdhw\n/";


    public static dussmain.Dussfootball dussfootball= null;
    public static dussmain.Dussfootball getDussfootballteam(){

        if (dussfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            dussfootball = retrofit.create(dussmain.Dussfootball.class);

        }

        return dussfootball;
    }
    public interface Dussfootball{


        @GET("https://api.myjson.com/bins/ggdhw\n/")
        Call<List<dussAPI>> getdussplayers();
    }
}
