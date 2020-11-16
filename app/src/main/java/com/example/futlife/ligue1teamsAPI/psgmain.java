package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class psgmain {

    private static final String url = "https://api.myjson.com/bins/12k9kw/";


    public static psgmain.Angersfootball angersfootball = null;
    public static psgmain.Angersfootball getpsgfootballteam(){

        if (angersfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            angersfootball = retrofit.create(psgmain.Angersfootball.class);

        }

        return angersfootball;
    }
    public interface Angersfootball{


        @GET("https://api.myjson.com/bins/12k9kw/")
        Call<List<psgAPI>> getpsgplayers();
    }
}
