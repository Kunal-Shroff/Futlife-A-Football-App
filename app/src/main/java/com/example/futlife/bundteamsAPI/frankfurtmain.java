package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class frankfurtmain {

    private static final String url = "https://api.myjson.com/bins/pzb6c/";


    public static frankfurtmain.Frankfurtfootball frankfurtfootball = null;
    public static frankfurtmain.Frankfurtfootball getFrankfurtfootballteam(){

        if (frankfurtfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            frankfurtfootball = retrofit.create(frankfurtmain.Frankfurtfootball.class);

        }

        return frankfurtfootball;
    }
    public interface Frankfurtfootball{


        @GET("https://api.myjson.com/bins/pzb6c/")
        Call<List<frankfurtAPI>> getfrankfurtplayers();
    }
}
