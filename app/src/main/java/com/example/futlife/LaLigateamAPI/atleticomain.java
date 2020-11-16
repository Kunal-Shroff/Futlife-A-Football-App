package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class atleticomain {

    private static final String url = "https://api.myjson.com/bins/gg4xk/";


    public static atleticomain.Atleticofootball atleticofootball = null;
    public static atleticomain.Atleticofootball getatleticoteam(){

        if (atleticofootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            atleticofootball = retrofit.create(atleticomain.Atleticofootball.class);

        }

        return atleticofootball;
    }
    public interface Atleticofootball{


        @GET("https://api.myjson.com/bins/gg4xk/")
        Call<List<atleticoAPI>> getatleticoplayers();
    }
}
