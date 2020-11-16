package com.example.futlife.serieAapi;


import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class laziomain {

    private static final String url = "https://api.myjson.com/bins/1csd4g/";


    public static laziomain.Lillefootball lillefootball = null;
    public static laziomain.Lillefootball getsaintfootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(laziomain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/1csd4g/")
        Call<List<lazioAPI>> getsaintplayers();
    }
}
