package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class osasunamain {

    private static final String url = "https://api.myjson.com/bins/17w7x4/";


    public static osasunamain.Osasunafootball osasunafootball = null;
    public static osasunamain.Osasunafootball getosasunateam(){

        if (osasunafootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

osasunafootball = retrofit.create(osasunamain.Osasunafootball.class);

        }

        return osasunafootball;
    }
    public interface Osasunafootball{


        @GET("https://api.myjson.com/bins/17w7x4/")
        Call<List<osasunaAPI>> getosasunaplayers();
    }
}
