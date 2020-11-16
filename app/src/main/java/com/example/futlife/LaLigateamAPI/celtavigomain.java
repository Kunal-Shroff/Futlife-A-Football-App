package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class celtavigomain {
    private static final String url = "https://api.myjson.com/bins/12f15k/";


    public static celtavigomain.Celtavigofootball celtavigofootball = null;
    public static celtavigomain.Celtavigofootball getceltavigoteam(){

        if (celtavigofootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            celtavigofootball = retrofit.create(celtavigomain.Celtavigofootball.class);

        }

        return celtavigofootball;
    }
    public interface Celtavigofootball{


        @GET("https://api.myjson.com/bins/12f15k/")
        Call<List<celtavigoAPI>> getceltavigoplayers();
    }
}
