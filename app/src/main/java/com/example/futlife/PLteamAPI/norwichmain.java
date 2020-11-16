package com.example.futlife.PLteamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class norwichmain {



        private static final String url = "https://api.myjson.com/bins/10vpn4/";


        public static norwichmain.Norwichfootball norwichfootball = null;
        public static norwichmain.Norwichfootball getnorwichteam(){

            if (norwichfootball==null){

                Retrofit retrofit = new Retrofit.Builder()

                        .baseUrl(url)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();


                norwichfootball = retrofit.create(norwichmain.Norwichfootball.class);

            }

            return norwichfootball;
        }
    public interface Norwichfootball{

        @GET("https://api.myjson.com/bins/10vpn4/")
        Call<List<norwichAPI>> getnorwichplayers();
    }
}
