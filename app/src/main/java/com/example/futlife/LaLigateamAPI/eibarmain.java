package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class eibarmain {

    private static final String url = "https://api.myjson.com/bins/f74k8/";


    public static eibarmain.Eibarfootball eibarfootball = null;
    public static eibarmain.Eibarfootball geteibarteam() {

        if (eibarfootball == null) {

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            eibarfootball = retrofit.create(eibarmain.Eibarfootball.class);

        }


        return eibarfootball;
    }
    public interface Eibarfootball{


        @GET("https://api.myjson.com/bins/f74k8/")
        Call<List<eibarAPI>> geteibarplayers();
    }
}
