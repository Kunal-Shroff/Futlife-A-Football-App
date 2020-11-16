package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class wolfsburgmain {

    private static final String url = " https://api.myjson.com/bins/hl3jo/";


    public static wolfsburgmain.Wolfsburgfootball wolfsburgfootball = null;
    public static wolfsburgmain.Wolfsburgfootball getWolfsburgfootballteam(){

        if (wolfsburgfootball ==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            wolfsburgfootball  = retrofit.create(wolfsburgmain.Wolfsburgfootball.class);

        }

        return wolfsburgfootball ;
    }
    public interface Wolfsburgfootball{


        @GET(" https://api.myjson.com/bins/hl3jo/")
        Call<List<wolfsburgAPI>> getwolfsburgplayers();
    }
}
