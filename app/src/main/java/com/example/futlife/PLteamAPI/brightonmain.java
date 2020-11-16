package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class brightonmain {

    private static final String url = "https://api.myjson.com/bins/1ee92o/";


    public static brightonmain.Brightonfootball brightonfootball = null;
    public static brightonmain.Brightonfootball getbrightonteam(){

        if (brightonfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            brightonfootball = retrofit.create(brightonmain.Brightonfootball.class);

        }

        return brightonfootball;
    }

    public interface Brightonfootball{


        @GET("https://api.myjson.com/bins/1ee92o/")
        Call<List<brightonAPI>> getbrightonplayers();
    }
}
