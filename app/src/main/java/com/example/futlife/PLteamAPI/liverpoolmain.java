package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class liverpoolmain {

    private static final String url = "https://api.myjson.com/bins/195my8/";


    public static liverpoolmain.Liverpoolfootball liverpoolfootball = null;
    public static liverpoolmain.Liverpoolfootball getliverpoolteam(){

        if (liverpoolfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            liverpoolfootball = retrofit.create(liverpoolmain.Liverpoolfootball.class);

        }

        return liverpoolfootball;
    }

    public interface Liverpoolfootball{


        @GET("https://api.myjson.com/bins/195my8/")
        Call<List<liverpoolAPI>> getliverpoolplayers();
    }
}
