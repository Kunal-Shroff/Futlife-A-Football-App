package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class evertonmain {


    private static final String url = "https://api.myjson.com/bins/17yrqo/";


    public static evertonmain.Evertonfootball evertonfootball = null;
    public static evertonmain.Evertonfootball getEvertonfootball(){

        if (evertonfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            evertonfootball = retrofit.create(evertonmain.Evertonfootball.class);

        }

        return evertonfootball;
    }

    public interface Evertonfootball{




        @GET("https://api.myjson.com/bins/17yrqo/")
        Call<List<evertonAPI>> getevertonplayers();
    }
}
