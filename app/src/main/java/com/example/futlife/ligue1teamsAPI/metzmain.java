package com.example.futlife.ligue1teamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class metzmain {

    private static final String url = "https://api.myjson.com/bins/axr40/";


    public static metzmain.Metzfootball metzfootball = null;
    public static metzmain.Metzfootball getmetzfootballteam(){

        if (metzfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            metzfootball = retrofit.create(metzmain.Metzfootball.class);

        }

        return metzfootball;
    }
    public interface Metzfootball{


        @GET("https://api.myjson.com/bins/axr40/")
        Call<List<metzAPI>> getmetzplayers();
    }
}
