package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class burnleymain {

    private static final String url = "https://api.myjson.com/bins/mevn4/";


    public static burnleymain.Burnleyfootball burnleyfootball = null;
    public static burnleymain.Burnleyfootball getburnleyteam(){

        if (burnleyfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            burnleyfootball = retrofit.create(burnleymain.Burnleyfootball.class);

        }

        return burnleyfootball;
    }

    public interface Burnleyfootball{


        @GET("https://api.myjson.com/bins/mevn4/")
        Call<List<burnleyAPI>> getburnleyplayers();
    }
}
