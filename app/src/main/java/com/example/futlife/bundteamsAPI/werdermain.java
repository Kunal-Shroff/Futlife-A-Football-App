package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class werdermain {

    private static final String url = "https://api.myjson.com/bins/16j5sk/";


    public static werdermain.Werderfootball werderfootball = null;
    public static werdermain.Werderfootball getWerderfootballteam(){

        if (werderfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            werderfootball = retrofit.create(werdermain.Werderfootball.class);

        }

        return werderfootball;
    }
    public interface Werderfootball{


        @GET("https://api.myjson.com/bins/16j5sk/")
        Call<List<werderAPI>> getwerderplayers();
    }
}
