package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class sassuolomain {

    private static final String url = "https://api.myjson.com/bins/16pqr4/";


    public static sassuolomain.Lillefootball lillefootball = null;
    public static sassuolomain.Lillefootball getsaintfootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(sassuolomain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/16pqr4/")
        Call<List<sassuoloAPI>> getsaintplayers();
    }
}
