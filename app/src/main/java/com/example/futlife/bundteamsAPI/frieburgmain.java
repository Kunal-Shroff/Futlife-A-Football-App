package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class frieburgmain {

    private static final String url = "https://api.myjson.com/bins/zbtdg/";


    public static frieburgmain.Frieburgfootball frieburgfootball = null;
    public static frieburgmain.Frieburgfootball getFrieburgfootballteam(){

        if (frieburgfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            frieburgfootball = retrofit.create(frieburgmain.Frieburgfootball.class);

        }

        return frieburgfootball;
    }
    public interface Frieburgfootball{


        @GET("https://api.myjson.com/bins/zbtdg/")
        Call<List<frieburgAPI>> getfrieburgplayers();
    }
}
