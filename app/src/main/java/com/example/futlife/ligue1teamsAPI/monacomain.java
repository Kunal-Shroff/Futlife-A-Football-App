package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class monacomain {

    private static final String url = "https://api.myjson.com/bins/utmps/";


    public static monacomain.Monacofootball monacofootball = null;
    public static monacomain.Monacofootball getmonacofootballteam(){

        if (monacofootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            monacofootball = retrofit.create(monacomain.Monacofootball.class);

        }

        return monacofootball;
    }
    public interface Monacofootball{


        @GET("https://api.myjson.com/bins/utmps/")
        Call<List<monacoAPI>> getmonacoplayers();
    }
}
