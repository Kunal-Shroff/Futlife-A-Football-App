package com.example.futlife.serieAapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class fiorentinamain {

    private static final String url = "https://api.myjson.com/bins/jfp00/";


    public static fiorentinamain.Lillefootball lillefootball = null;
    public static fiorentinamain.Lillefootball getLillefootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(fiorentinamain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/jfp00/")
        Call<List<fiorentinaAPI>> getlilleplayers();
    }
}
