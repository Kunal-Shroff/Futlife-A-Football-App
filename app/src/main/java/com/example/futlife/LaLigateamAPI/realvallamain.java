package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class realvallamain {

    private static final String url = " https://api.myjson.com/bins/134r2w/";


    public static realvallamain.Realvallafootball realvallafootball = null;
    public static realvallamain.Realvallafootball getrealvallateam(){

        if (realvallafootball ==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            realvallafootball = retrofit.create(realvallamain.Realvallafootball.class);

        }

        return realvallafootball;
    }
    public interface Realvallafootball{


        @GET(" https://api.myjson.com/bins/134r2w/")
        Call<List<realvallaAPI>> getrealvallaplayers();
    }
}
