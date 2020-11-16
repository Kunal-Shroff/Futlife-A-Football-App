package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class uberlinmain {
    private static final String url = "https://api.myjson.com/bins/fuxw4/";


    public static uberlinmain.Uberlinfootball uberlinfootball = null;
    public static uberlinmain.Uberlinfootball getuberlinteam(){

        if (uberlinfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            uberlinfootball = retrofit.create(uberlinmain.Uberlinfootball.class);

        }

        return uberlinfootball;
    }
    public interface Uberlinfootball{


        @GET("https://api.myjson.com/bins/fuxw4/")
        Call<List<uberlinAPI>> getuberlinplayers();
    }
}
