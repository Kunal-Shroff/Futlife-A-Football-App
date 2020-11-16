package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class spalmain {

    private static final String url = "https://api.myjson.com/bins/qp6kw/";


    public static spalmain.Lillefootball lillefootball = null;
    public static spalmain.Lillefootball getsaintfootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(spalmain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/qp6kw/")
        Call<List<spalAPI>> getsaintplayers();
    }
}
