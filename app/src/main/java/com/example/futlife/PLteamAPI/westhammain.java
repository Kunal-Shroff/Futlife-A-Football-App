package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class westhammain {

    private static final String url = "https://api.myjson.com/bins/ueav4/";


    public static westhammain.Westhamfootball westhamfootball = null;
    public static westhammain.Westhamfootball getwesthamteam(){

        if (westhamfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            westhamfootball = retrofit.create(westhammain.Westhamfootball.class);

        }

        return westhamfootball;
    }

    public interface Westhamfootball{


        @GET("https://api.myjson.com/bins/ueav4/")
        Call<List<westhamAPI>> getwesthamplayers();
    }
}
