package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class sevillamain {

    private static final String url = "https://api.myjson.com/bins/k0qk8/";


    public static sevillamain.Sevillafootball sevillafootball = null;
    public static sevillamain.Sevillafootball getsevillateam(){

        if (sevillafootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            sevillafootball = retrofit.create(sevillamain.Sevillafootball.class);

        }

        return sevillafootball;
    }
    public interface Sevillafootball{


        @GET("https://api.myjson.com/bins/k0qk8/")
        Call<List<sevillaAPI>> getsevillaplayers();
    }
}
