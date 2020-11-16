package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class herthamain {

    private static final String url = "https://api.myjson.com/bins/ge8c4/";


    public static herthamain.Herthafootball herthafootball = null;
    public static herthamain.Herthafootball getHerthafootballteam(){

        if (herthafootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            herthafootball = retrofit.create(herthamain.Herthafootball.class);

        }

        return herthafootball;
    }
    public interface Herthafootball{


        @GET("https://api.myjson.com/bins/ge8c4/")
        Call<List<herthaAPI>> getherthaplayers();
    }
}
