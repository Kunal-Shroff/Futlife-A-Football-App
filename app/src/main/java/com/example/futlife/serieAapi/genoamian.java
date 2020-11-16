package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class genoamian {

    private static final String url = "https://api.myjson.com/bins/xudu8/";


    public static genoamian.Lillefootball lillefootball = null;
    public static genoamian.Lillefootball getLillefootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(genoamian.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/xudu8/")
        Call<List<genoaAPI>> getlilleplayers();
    }

}
