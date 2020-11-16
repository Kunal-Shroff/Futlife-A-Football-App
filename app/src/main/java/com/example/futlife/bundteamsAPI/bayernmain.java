package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class bayernmain {

    private static final String url = "https://api.myjson.com/bins/18bglw\n/";


    public static bayernmain.Bayernfootball bayernfootball = null;
    public static bayernmain.Bayernfootball getBayernfootballteam(){

        if (bayernfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            bayernfootball = retrofit.create(bayernmain.Bayernfootball.class);

        }

        return bayernfootball;
    }
    public interface Bayernfootball{


        @GET("https://api.myjson.com/bins/18bglw\n/")
        Call<List<bayernAPI>> getbayernplayers();
    }
}
