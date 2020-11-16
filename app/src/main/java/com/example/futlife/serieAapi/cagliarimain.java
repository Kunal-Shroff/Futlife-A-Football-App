package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class cagliarimain {

    private static final String url = "https://api.myjson.com/bins/17sbn4/";


    public static cagliarimain.Lillefootball lillefootball = null;
    public static cagliarimain.Lillefootball getLillefootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(cagliarimain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/17sbn4/")
        Call<List<cagliariAPI>> getlilleplayers();
    }
}
