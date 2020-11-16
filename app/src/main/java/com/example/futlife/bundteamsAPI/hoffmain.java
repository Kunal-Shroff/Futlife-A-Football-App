package com.example.futlife.bundteamsAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class hoffmain {

    private static final String url = "https://api.myjson.com/bins/mxzzo/";


    public static hoffmain.Hofffootball hofffootball = null;
    public static hoffmain.Hofffootball getHofffootballteam(){

        if (hofffootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            hofffootball = retrofit.create(hoffmain.Hofffootball.class);

        }

        return hofffootball;
    }
    public interface Hofffootball{


        @GET("https://api.myjson.com/bins/mxzzo/")
        Call<List<hoffAPI>> gethoffplayers();
    }
}
