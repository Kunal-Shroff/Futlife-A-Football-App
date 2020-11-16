package com.example.futlife.PLteamAPI;



import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class bournemouthmain {

    private static final String url = "https://api.myjson.com/bins/jfpm8/";


    public static bournemouthmain.Bournemouthfootball bournemouthfootball = null;
    public static bournemouthmain.Bournemouthfootball getbournemouthteam(){

        if (bournemouthfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            bournemouthfootball = retrofit.create(bournemouthmain.Bournemouthfootball.class);

        }

        return bournemouthfootball;
    }


    public interface Bournemouthfootball{


        @GET("https://api.myjson.com/bins/jfpm8/")
        Call<List<bournemouthAPI>> getbournemouthplayers();
    }

}
