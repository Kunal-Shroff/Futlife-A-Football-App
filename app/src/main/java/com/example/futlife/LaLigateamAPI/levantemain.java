package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class levantemain {

    private static final String url = "https://api.myjson.com/bins/fsk60/";


    public static levantemain.Levantefootball levantefootball = null;
    public static levantemain.Levantefootball getleavnteteam(){

        if (levantefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            levantefootball = retrofit.create(levantemain.Levantefootball.class);

        }

        return levantefootball;
    }
    public interface Levantefootball{


        @GET("https://api.myjson.com/bins/fsk60/")
        Call<List<levanteAPI>> getlevanteplayers();
    }
}


