package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class barcelonamain {


    private static final String url = "https://api.myjson.com/bins/gg4xk/";


    public static barcelonamain.Barcelonafootball barcelonafootball = null;
    public static barcelonamain.Barcelonafootball getbarcelonateam(){

        if (barcelonafootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            barcelonafootball = retrofit.create(barcelonamain.Barcelonafootball.class);

        }

        return barcelonafootball;
    }
    public interface Barcelonafootball{


        @GET("https://api.myjson.com/bins/gg4xk/")
        Call<List<barcelonaAPI>> getbarcelonaplayers();
    }
}
