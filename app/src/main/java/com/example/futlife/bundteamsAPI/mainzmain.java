package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class mainzmain {

    private static final String url = "https://api.myjson.com/bins/16ng44/";


    public static mainzmain.Mainzfootball mainzfootball = null;
    public static mainzmain.Mainzfootball getMainzfootballteam(){

        if (mainzfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            mainzfootball = retrofit.create(mainzmain.Mainzfootball.class);

        }

        return mainzfootball;
    }
    public interface Mainzfootball{


        @GET("https://api.myjson.com/bins/16ng44/")
        Call<List<mainzAPI>> getmainzplayers();
    }
}
