package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class bayermain {

    private static final String url = "https://api.myjson.com/bins/18dlro/";


    public static bayermain.Bayerfootball bayerfootball = null;
    public static bayermain.Bayerfootball getBayerfootballteam(){

        if (bayerfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            bayerfootball = retrofit.create(bayermain.Bayerfootball.class);

        }

        return bayerfootball;
    }
    public interface Bayerfootball{


        @GET("https://api.myjson.com/bins/18dlro/")
        Call<List<bayerAPI>> getbayerplayers();
    }
}
