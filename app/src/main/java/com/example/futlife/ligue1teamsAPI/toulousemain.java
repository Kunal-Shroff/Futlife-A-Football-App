package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class toulousemain {

    private static final String url = "https://api.myjson.com/bins/8hvj4/";


    public static toulousemain.Lillefootball lillefootball = null;
    public static toulousemain.Lillefootball gettoulousefootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(toulousemain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/8hvj4/")
        Call<List<toulouseAPI>> gettoulouseplayers();
    }
}


