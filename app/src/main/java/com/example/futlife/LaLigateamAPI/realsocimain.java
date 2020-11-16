package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class realsocimain {

    private static final String url = "https://api.myjson.com/bins/178n5k/";


    public static realsocimain.Realsocifootball realsocifootball = null;
    public static realsocimain.Realsocifootball getrealsociteam(){

        if (realsocifootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            realsocifootball = retrofit.create(realsocimain.Realsocifootball.class);

        }

        return realsocifootball;
    }
    public interface Realsocifootball{


        @GET("https://api.myjson.com/bins/178n5k/")
        Call<List<realsociAPI>> getrealsociplayers();
    }
}
