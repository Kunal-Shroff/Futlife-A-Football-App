package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class strasbourgmain {

    private static final String url = "https://api.myjson.com/bins/aglts/";


    public static strasbourgmain.Lillefootball lillefootball = null;
    public static strasbourgmain.Lillefootball getstrasfootballteam(){

        if (lillefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            lillefootball = retrofit.create(strasbourgmain.Lillefootball.class);

        }

        return lillefootball;
    }
    public interface Lillefootball{


        @GET("https://api.myjson.com/bins/aglts/")
        Call<List<strasbourgAPI>> getstrasplayers();
    }
}
