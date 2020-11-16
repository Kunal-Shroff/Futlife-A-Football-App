package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class intermain {

    private static final String url = "https://api.myjson.com/bins/m27s0/";


    public static intermain.Lillefootball lillefootball = null;
    public static intermain.Lillefootball getsaintfootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(intermain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/m27s0/")
        Call<List<interAPI>> getsaintplayers();
    }
}
