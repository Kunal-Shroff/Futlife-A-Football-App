package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class nicemain {

    private static final String url = "https://api.myjson.com/bins/uvrvk/";


    public static nicemain.Angersfootball angersfootball = null;
    public static nicemain.Angersfootball getnicefootballteam(){

        if (angersfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            angersfootball = retrofit.create(nicemain.Angersfootball.class);

        }

        return angersfootball;
    }
    public interface Angersfootball{


        @GET("https://api.myjson.com/bins/uvrvk/")
        Call<List<niceAPI>> getniceplayers();
    }
}
