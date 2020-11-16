package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class espanyolmain {

    private static final String url = "https://api.myjson.com/bins/96nco/";


    public static espanyolmain.Espanyolfootball espanyolfootball = null;

    public static espanyolmain.Espanyolfootball getespanyolteam() {

        if (espanyolfootball == null) {

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            espanyolfootball = retrofit.create(espanyolmain.Espanyolfootball.class);

        }

        return espanyolfootball;
    }


    public interface Espanyolfootball {


        @GET("https://api.myjson.com/bins/96nco/")
        Call<List<espanyolAPI>> getespanyolplayers();
    }
}