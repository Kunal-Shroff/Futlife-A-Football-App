package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class atlantamain {

    private static final String url = "https://api.myjson.com/bins/odlbk/";


    public static atlantamain.Lillefootball lillefootball = null;
    public static atlantamain.Lillefootball getLillefootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(atlantamain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/odlbk/")
        Call<List<atlantaAPI>> getlilleplayers();
    }
}
