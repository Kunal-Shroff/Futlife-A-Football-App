package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class juventusmain {

    private static final String url = "https://api.myjson.com/bins/j31r4/";


    public static juventusmain.Lillefootball lillefootball = null;
    public static juventusmain.Lillefootball getsaintfootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(juventusmain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/j31r4/")
        Call<List<juventusAPI>> getsaintplayers();
    }
}
