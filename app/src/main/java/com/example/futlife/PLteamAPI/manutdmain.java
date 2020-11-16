package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class manutdmain {

    private static final String url = "https://api.myjson.com/bins/168m34/";


    public static manutdmain.Manutdfootball manutdfootball = null;
    public static manutdmain.Manutdfootball getmanutdteam(){

        if (manutdfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            manutdfootball = retrofit.create(manutdmain.Manutdfootball.class);

        }

        return manutdfootball;
    }

    public interface Manutdfootball{


        @GET("https://api.myjson.com/bins/168m34/")
        Call<List<manutdAPI>> getmanutdplayers();
    }
}
