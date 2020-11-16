package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class lyonmain {

    private static final String url = "https://api.myjson.com/bins/acbi8/";


    public static lyonmain.Lyonfootball lyonfootball = null;
    public static lyonmain.Lyonfootball getlyonfootballteam(){

        if (lyonfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lyonfootball = retrofit.create(lyonmain.Lyonfootball.class);

        }

        return lyonfootball;
    }
    public interface Lyonfootball{


        @GET("https://api.myjson.com/bins/acbi8/")
        Call<List<lyonAPI>> getlyonplayers();
    }
}
