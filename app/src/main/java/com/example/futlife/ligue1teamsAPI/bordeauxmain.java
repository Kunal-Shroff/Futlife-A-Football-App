package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class bordeauxmain {

    private static final String url = "https://api.myjson.com/bins/133k0w/";


    public static bordeauxmain.Bordfootball bordfootball = null;
    public static bordeauxmain.Bordfootball getbordfootballteam(){

        if (bordfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            bordfootball = retrofit.create(bordeauxmain.Bordfootball.class);

        }

        return bordfootball;
    }
    public interface Bordfootball{


        @GET("https://api.myjson.com/bins/133k0w/")
        Call<List<bordeauxAPI>> getbordplayers();
    }
}
