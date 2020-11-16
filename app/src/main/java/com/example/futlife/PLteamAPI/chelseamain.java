package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class chelseamain {

    private static final String url = "https://api.myjson.com/bins/veivk/";


    public static chelseamain.Chelseafootball chelseafootball = null;
    public static chelseamain.Chelseafootball getchelseateam(){

        if (chelseafootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            chelseafootball  = retrofit.create(chelseamain.Chelseafootball.class);

        }

        return chelseafootball;
    }

    public interface Chelseafootball{


        @GET("https://api.myjson.com/bins/veivk/")
        Call<List<chelseaAPI>> getchelseaplayers();
    }

}
