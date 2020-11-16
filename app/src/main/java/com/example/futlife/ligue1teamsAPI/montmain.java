package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class montmain {

    private static final String url = "https://api.myjson.com/bins/177g3k/";


    public static montmain.Angersfootball angersfootball = null;
    public static montmain.Angersfootball getmontfootballteam(){

        if (angersfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            angersfootball = retrofit.create(montmain.Angersfootball.class);

        }

        return angersfootball;
    }
    public interface Angersfootball{


        @GET("https://api.myjson.com/bins/177g3k/")
        Call<List<montAPI>> getmontplayers();
    }
}
