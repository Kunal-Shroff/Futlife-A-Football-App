package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class nimesmain {

    private static final String url = "https://api.myjson.com/bins/8uqhs/";


    public static nimesmain.Angersfootball angersfootball = null;
    public static nimesmain.Angersfootball getnimesfootballteam(){

        if (angersfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            angersfootball = retrofit.create(nimesmain.Angersfootball.class);

        }

        return angersfootball;
    }
    public interface Angersfootball{


        @GET("https://api.myjson.com/bins/8uqhs/")
        Call<List<nimesAPI>> getnimesplayers();
    }
}
