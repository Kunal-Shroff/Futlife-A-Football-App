package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class dijonmain {

    private static final String url = "https://api.myjson.com/bins/16jvc0/";


    public static dijonmain.Dijonfootball dijonfootball = null;
    public static dijonmain.Dijonfootball getDijonfootballteam(){

        if (dijonfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            dijonfootball = retrofit.create(dijonmain.Dijonfootball.class);

        }

        return dijonfootball;
    }
    public interface Dijonfootball{


        @GET("https://api.myjson.com/bins/16jvc0/")
        Call<List<dijonAPI>> getdijonplayers();
    }
}
