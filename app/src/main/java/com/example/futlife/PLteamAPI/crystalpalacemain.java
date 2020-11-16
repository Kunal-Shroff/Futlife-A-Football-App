package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class crystalpalacemain {

    private static final String url = "https://api.myjson.com/bins/pibzk/";


    public static crystalpalacemain.CrystalPalacefootball crystalPalacefootball = null;
    public static crystalpalacemain.CrystalPalacefootball getcrystalpalaceteam(){

        if (crystalPalacefootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            crystalPalacefootball = retrofit.create(crystalpalacemain.CrystalPalacefootball.class);

        }

        return crystalPalacefootball;
    }


    public interface CrystalPalacefootball{


        @GET("https://api.myjson.com/bins/pibzk/")
        Call<List<crystalpalaceAPI>> getcrystalpalaceplayers();
    }
}
