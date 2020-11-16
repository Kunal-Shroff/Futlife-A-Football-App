package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class sheffutdmain {

    private static final String url = "https://api.myjson.com/bins/wpoeo/";


    public static sheffutdmain.Sheffutdfootball sheffutdfootball = null;
    public static sheffutdmain.Sheffutdfootball getsheffutdteam(){

        if (sheffutdfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            sheffutdfootball = retrofit.create(sheffutdmain.Sheffutdfootball.class);

        }

        return sheffutdfootball;
    }

    public interface Sheffutdfootball{


        @GET("https://api.myjson.com/bins/wpoeo/")
        Call<List<sheffutdAPI>> getsheffutdplayers();
    }
}
