package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class angersmain {

    private static final String url = "https://api.myjson.com/bins/mypj4/";


    public static angersmain.Angersfootball angersfootball = null;
    public static angersmain.Angersfootball getangersfootballteam(){

        if (angersfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            angersfootball = retrofit.create(angersmain.Angersfootball.class);

        }

        return angersfootball;
    }
    public interface Angersfootball{


        @GET("https://api.myjson.com/bins/mypj4/")
        Call<List<angersAPI>> getangersplayers();
    }
}
