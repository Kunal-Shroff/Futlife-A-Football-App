package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class paderbornmain {

    private static final String url = "https://api.myjson.com/bins/1grtec/";


    public static paderbornmain.Paderbornfootball paderbornfootball = null;
    public static paderbornmain.Paderbornfootball getPaderbornfootballteam(){

        if (paderbornfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            paderbornfootball= retrofit.create(paderbornmain.Paderbornfootball.class);

        }

        return paderbornfootball;
    }
    public interface Paderbornfootball{


        @GET("https://api.myjson.com/bins/1grtec/")
        Call<List<paderbornAPI>> getpaderbornplayers();
    }
}
