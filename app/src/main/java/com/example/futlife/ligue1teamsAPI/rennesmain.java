package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class rennesmain {

    private static final String url = "https://api.myjson.com/bins/18ebb4/";


    public static rennesmain.Lillefootball lillefootball = null;
    public static rennesmain.Lillefootball getrennesfootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(rennesmain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/18ebb4/")
        Call<List<rennesAPI>> getrennesplayers();
    }
}
