package com.example.futlife.LaLigateamAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class realbetismain {

    private static final String url = "https://api.myjson.com/bins/uoeag/";


    public static realbetismain.Realbetisfootball realbetisfootball = null;
    public static realbetismain.Realbetisfootball getRealbetisteam(){

        if (realbetisfootball==null){

            Retrofit retrofit = new Retrofit.Builder()

                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            realbetisfootball = retrofit.create(realbetismain.Realbetisfootball.class);

        }

        return realbetisfootball;
    }
    public interface Realbetisfootball{


        @GET("https://api.myjson.com/bins/uoeag/")
        Call<List<realbetisAPI>> getrealbetisplayers();
    }
}
