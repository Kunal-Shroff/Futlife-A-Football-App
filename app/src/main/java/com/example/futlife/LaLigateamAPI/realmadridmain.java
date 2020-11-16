package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class realmadridmain {

    private static final String url = "https://api.myjson.com/bins/mxrfc/";


    public static realmadridmain.Realmadridfootball realmadridfootball = null;
    public static realmadridmain.Realmadridfootball getrealmadridteam(){

        if (realmadridfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            realmadridfootball = retrofit.create(realmadridmain.Realmadridfootball.class);

        }

        return realmadridfootball;
    }
    public interface Realmadridfootball{


        @GET("https://api.myjson.com/bins/mxrfc/")
        Call<List<realmadridAPI>> getrealmadridplayers();
    }
}
