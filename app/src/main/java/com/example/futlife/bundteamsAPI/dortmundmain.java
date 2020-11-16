package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class dortmundmain {

    private static final String url = "https://api.myjson.com/bins/1fit10/";


    public static dortmundmain.Dortmundfootball dortmundfootball = null;
    public static dortmundmain.Dortmundfootball getDortmundfootballteam(){

        if (dortmundfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            dortmundfootball = retrofit.create(dortmundmain.Dortmundfootball.class);

        }

        return dortmundfootball;
    }
    public interface Dortmundfootball{


        @GET("https://api.myjson.com/bins/1fit10/")
        Call<List<dortmundAPI>> getdortmundplayers();
    }
}
