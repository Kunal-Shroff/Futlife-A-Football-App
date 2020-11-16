package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class leganesmain {

    private static final String url = "https://api.myjson.com/bins/132lx4/";


    public static leganesmain.Leganesfootball leganesfootball = null;
    public static leganesmain.Leganesfootball getleganesteam(){

        if (leganesfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            leganesfootball = retrofit.create(leganesmain.Leganesfootball.class);

        }

        return leganesfootball;
    }

    public interface Leganesfootball{


        @GET("https://api.myjson.com/bins/132lx4/")
        Call<List<leganesAPI>> getleganesplayers();
    }
}
